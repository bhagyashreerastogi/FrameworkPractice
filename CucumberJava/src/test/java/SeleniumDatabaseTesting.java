package database;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleniumDatabaseTesting {
	// Connection object
	static Connection con = null;
	// Statement object
	private static Statement stmt;
	// Constant for Database URL
	public static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//Database User name
	public static String DB_USER = "system";
	// Database Password
	public static String DB_PASSWORD = "db123";

	@BeforeTest
	public void setUp() throws Exception {
		try{
			// Database connection
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			System.out.println("*** Driver Loaded ***");
			//	String dbClass = "oracle.jdbc.driver.OracleDriver";
			//	Class.forName(dbClass).newInstance();

			// Get connection to DB
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("*** Connected to Oracle database ***");

			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement();
			System.out.println("created the statement object");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		try{
			String query = "select * from qadb";
			// Get the contents of user info table from DB
			ResultSet res = stmt.executeQuery(query);
			// Print the result until all the records are printed
			// res.next() returns true if there is any next record else returns false
			while (res.next())
			{
				System.out.println(res.getString(1)+"  "+res.getInt(2)+"  "+res.getInt(3));		
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@AfterTest
	public void tearDown() throws Exception {
		// Close DB connection
		if (con != null) {
			con.close();
		}
	}
}