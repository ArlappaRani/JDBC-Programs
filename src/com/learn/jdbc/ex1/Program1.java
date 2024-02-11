package com.learn.jdbc.ex1;


//1.import java.sql package
import java.sql.*;
public class Program1 {

	public static void main(String[] args) 
	{
		
		
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
		    String username="root";
			String password="Jesus@07";
			
			
			
		//2.loading driver
       Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driveer is loaded");
		
		//3.Establishing the connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is established at"+con);
		
	
		
        }
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
