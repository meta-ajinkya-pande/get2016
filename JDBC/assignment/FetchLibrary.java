package assignment;

import java.sql.Connection;
import java.util.*;
import java.sql.*;
/**
 * This class fetch the information of library database as required
 * @author Ajinkya Pande
 *
 */
public class FetchLibrary {

	private Connection con;	
	private DBconnection db;
	
	// Constructor
	public FetchLibrary() {
		db = new DBconnection();
	}

	/**
	 * This function load the driver as well as connect to driver of vendor database
	 */
	public void getConnection() {
		db.loadDriver();
		con = db.ConnectDriver();
	}

	/**
	 * This function get the book title and its id's from the database 
	 * @param authorName is the name of author according to which it will provide the book title and id's of that book which author name is authorName
	 * @return list of the title objects that contains title name and id's.
	 */
	public List<Title> getBookTitle(String authorName) {
		List<Title> title = new ArrayList<Title>();

		String query = 	"SELECT "
							+ "title.title_id,title_nm from title "
						+ "INNER JOIN "
							+ "title_author ON title.title_id=title_author.title_id "
						+ "INNER JOIN "
							+ "authors on title_author.author_id=authors.author_id  "
						+ "WHERE "
							+ "authors.author_nm=?";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, authorName);
			ResultSet res = ps.executeQuery();

			while (res.next()) {
				Title t = new Title();
				t.setTitleId(res.getString(1));
				t.setTitleName(res.getString(2));
				title.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return title;
	}

	/**
	 * This function determines that book is issued or not 
	 * @param bookName is the name of book required to find out that is issued or not
	 * @return boolean value if it issued then true else false
	 */
	public Boolean isBookIssue(String bookName) {

		String query = "SELECT "
						+ "count(*) from book_issue bi "
						+ "INNER JOIN "
						+ "book b ON bi.accession_no=b.accession_no "
						+ "INNER JOIN "
						+ "title t on b.title_id=t.title_id where t.title_nm=?";
		Boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, bookName);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				int count = res.getInt(1);
				if (count > 0) {
					flag = true;
				}
			}
			ps.close();
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * It delete the books which is not issued more than 1 year
	 * @return no of book deleted
	 */
	public int bookDelete() {
		String query = "SELECT "
						+ "b.accession_no FROM book b "
						+ "LEFT JOIN "
						+ "book_issue bi ON b.accession_no=bi.accession_no "
						+ "WHERE TIMESTAMPDIFF(YEAR, bi.issue_dt,CURRENT_TIMESTAMP)>=1 OR bi.issue_dt is NULL";
		List<String> book = new ArrayList<String>();
		/*
		 * list book add all the book that were to be deleted further
		 */
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				book.add(res.getString(1));
			}
			ps.close();
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query1 = "DELETE FROM book WHERE accession_no=?";
		/*
		 * deleted all books one by one that are in list book
		 */
		try {

			PreparedStatement ps1 = con.prepareStatement(query1);
			for (int i = 0; i < book.size(); i++) {
				ps1.setString(1, book.get(i));
				ps1.executeUpdate();
			}
			ps1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book.size();
	}

	
	public void closeConnection() {
		db.closeConnection();
	}
}
