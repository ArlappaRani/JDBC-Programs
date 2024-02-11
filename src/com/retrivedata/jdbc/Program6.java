package com.retrivedata.jdbc;
import java.sql.*;
public class Program6 {

	public static void main(String[] args) {
		
	try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		String query="SELECT * FROM STUDENT";
		
		//LOADING DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//establishing the connection
	Connection con=	DriverManager.getConnection(url, username, password);
    System.out.println("connection established"+con);
    
    //creating the statement
    Statement stmt=con.createStatement();
    
    //executing the query using statement
    ResultSet rs=stmt.executeQuery(query);
    
    //Traversing using result set
    while(rs.next())
    {
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}

}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
