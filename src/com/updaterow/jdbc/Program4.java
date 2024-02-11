package com.updaterow.jdbc;
import java.sql.*;
public class Program4 {

	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		String query="UPDATE STUDENT SET NAME='ANKIT'WHERE ROLL=3";
		//1.CONNECTING THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//2.Establish connection
	   Connection con =DriverManager.getConnection(url, username, password);
	   System.out.println("Connection is established"+con);
	
	   //3.creating the statement
	   Statement stmt=con.createStatement();
	   
	   //Excecuting the query using statement
	   stmt.executeUpdate(query);
	   System.out.println("Query is executed");

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
