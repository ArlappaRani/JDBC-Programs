package com.jdbc.createtable;
import java.sql.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		String query="CREATE TABLE STUDENT(ROLL INT,NAME VARCHAR(10))";
		
		//LOADING THE DRICVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		//2.Establishing the connection
		 Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established"+con);
		
		//3,creating the statement
		Statement stmt=con.createStatement();
		
		//4.Executing the query using statement
		stmt.execute(query);
		System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
