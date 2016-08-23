package assignment;

import java.util.*;
/**
 * This main class to get Information of books 
 * @author Ajinkya Pande
 *
 */
public class JdbcMain {

	public static void main(String args[]) {
		
		FetchLibrary fetch = new FetchLibrary();
		fetch.getConnection();
		// Getting name of the author
		System.out.println("Enter author name");
		Scanner sc = new Scanner(System.in);
		String author = sc.next();
		List<Title> titles = fetch.getBookTitle(author);
		// Getting the list of books of that authors
		System.out.println("----- Title_id and Title_name written by author "
				+ author + " ------");
		for (int i = 0; i < titles.size(); i++) {
			Title title = new Title();
			title = titles.get(i);
			System.out.println(title.getTitleId() + " " + title.getTitleName());
		}
		
		// Getting information that book is is issued or not 
		System.out
				.println("Enter book name to check that this book is issue or not");
		String book = sc.next();
		Boolean isBookIssued = fetch.isBookIssue(book);
		if (isBookIssued == true) {
			System.out.println("Book issued");
		} else {
			System.out.println("No book is issued");
		}
		
		// Deleting the books that is not issued more than 1 year
		System.out.println(fetch.bookDelete() + "book deleted");
		System.out
				.println("that are not issue since 1 year or not issue still");
		fetch.closeConnection();
		sc.close();
	}
}
