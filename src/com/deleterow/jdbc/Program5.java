package com.deleterow.jdbc;
import java.sql.*;
public class Program5 {

	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		String query="DELETE FROM STUDENT WHERE ROLL=3";
		
		//LOADING THE DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		//Establishing the connection
		Connection con=DriverManager.getConnection(url, username, password);
        System.out.println("Connection is established"+con);
        
        //creating the statement 
        Statement stmt=con.createStatement();
        
        //executing the query using statement
        stmt.executeUpdate(query);
        System.out.println("query is excuted");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
