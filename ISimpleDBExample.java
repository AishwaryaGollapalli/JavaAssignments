package com.day19;

//Java program to set up connection and get all data from table
import java.sql.*;

public class ISimpleDBExample {
	public static void main(String arg[]) {
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sept2", "root", "pass@word1");

			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database

			PreparedStatement ps = connection.prepareStatement("insert into messages values(?,?,?,?)");
            ps.setInt(1, 6);
			ps.setString(2, "name6");
			ps.setString(3, "completed");
			ps.setString(4, "internal");
			  
			int records;
			records = ps.executeUpdate();
			System.out.println("Inserted "+records+ " records successfully");
			
		
			ps.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	} // function ends
} // class ends