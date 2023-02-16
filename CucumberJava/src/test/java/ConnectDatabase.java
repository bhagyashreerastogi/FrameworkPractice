package database;	

import  java.sql.*;	

public class ConnectDatabase {		

	public static void main(String args[]) throws ClassNotFoundException, SQLException{  

		//step1. load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		System.out.println("*** Driver Loaded ***");

		//step2. create  the connection object  
		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","system","db123"); 
		
		System.out.println("*** Connected to Oracle database ***");

		//step3 create the statement object  
		Statement stmt=con.createStatement();  

		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from qadb");  
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  

		//step5 close the connection object  
		con.close();  

	}  
}