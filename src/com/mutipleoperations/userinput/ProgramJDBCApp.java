package com.mutipleoperations.userinput;
import java.sql.*;
import java.util.*;
public class ProgramJDBCApp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		//Establishing the connection
		
		//Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connection is established");
        
        
        //Creating the statement
       // Statement stmt=con.createStatement();
        ProgramJDBCApp var1= new ProgramJDBCApp();
       
   Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter 1 for create table,2 for reading the data,3 for inserting the data "
        		+ "4 for updating the data ,5 for deleting the data");
        
        
       
	}

}
