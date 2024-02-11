package com.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String username="root";
			String password="Jesus@07";
			String query="Update Employee1 set salary=(salary+10000) Where ID=2";
			
			//establishing the connection
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established"+con);
			
			//creating a statement
			Statement stmt=con.createStatement();
			
			//executing the query using statement
			stmt.executeUpdate(query);
			System.out.println("query executed");
	 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	

	}

}
