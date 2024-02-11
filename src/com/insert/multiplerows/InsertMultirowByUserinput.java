package com.insert.multiplerows;
import java.sql.*;
import java.util.Scanner;

public class InsertMultirowByUserinput {

	public static void main(String[] args) {
		
		String url="jdbc:mysql:localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
	
		//Establishing the connection
		//Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("C");
		
		//TAKING THE user input
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of rows to be inserted");
		int rows=scan.nextInt();
		//multiple times activity doing
		for(int i=1;i<=rows;i++)
		{
			System.out.println("Enter id");
			int id=scan.nextInt();
			System.out.println("Enter name");
			String name=scan.next();
			System.out.println("Enter salary");
			int salary=scan.nextInt();
			
			
		}
		
		
		
		

	}

}
