package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * This Class is used to connect the java program to database 
 * @author Ajinkya Pande
 *
 */
public class DBconnection {
	
	Connection con = null; // Connection object to connect database

	/**
	 * This function loads the drivers of vendor database
	 */
	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	/**
	 * This function will connect the driver to that vendor database
	 * @return connection object for that database
	 */
	public Connection ConnectDriver() {
		String host = "jdbc:mysql://localhost:3306/";
		String db = "library";
		String url = host + db;

		String userid = "root";
		String pass = "21ajinku##";
		try {
			con = DriverManager.getConnection(url, userid, pass);
		} catch (SQLException e) {
			System.out.println("Can't connect to database");
		}
		return con;
	}

	/**
	 * This will close the connection with the database
	 */
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Error...");
		}
	}
}
