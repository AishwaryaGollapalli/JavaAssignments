package com.day19;

//Java program to set up connection and get all data from table
import java.sql.*;

public class SimpleDBExample {
	public static void main(String arg[]) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver class name
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2", "root", "pass@word1"); // connection string
			/*																							
			 ip address -  "jdbc:mysql://127.0.0.1:3306/sept2","root", "pass@word1");
			 without port number -  "jdbc:mysql://localhost/sept2","root", "pass@word1");
			// mydb is database
			// mydbuser is name of database
			// mydbuser is password of database   
			 * */ 
			 

			statement = connection.createStatement();
			
			

			resultSet = statement.executeQuery("select * from messages");
			int code;
			String name, msg, type;
			while (resultSet.next()) {
				code = resultSet.getInt("id");
				name = resultSet.getString("pname").trim();
				msg = resultSet.getString("msg").trim();
				type = resultSet.getString("ptype").trim();
				System.out.println("Code : " + code + "| Name : " + name + " | Message: " + msg+ " | Type: " + type);
			}

		} catch (Exception exception) {
			System.out.println(exception);
		} finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	} // function ends
} // class ends