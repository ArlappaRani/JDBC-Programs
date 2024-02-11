package com.insertvalue.jdbc;
import java.sql.*;
public class Program3 {

	public static void main(String[] args) {
		try {
	 String url="jdbc:mysql://localhost:3306/jdbc_database";
	 String username="root";
	 String password="Jesus@07";
	 String query="INSERT INTO STUDENT VALUES(1,'ROHIT'),(2,'MOHIT'),(3,'AJAY')";
	 
	 //1.LOADING THE DRIVER
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Driver loaded");
	 
	 //2.establishing the connection
	Connection con=DriverManager.getConnection(url, username, password);
	System.out.println("Connection established"+con);
	
	//3.creating the statement
	Statement stmt=con.createStatement();
	//4.excuting the query using statement
	stmt.executeUpdate(query);
	System.out.println("query is executed");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}