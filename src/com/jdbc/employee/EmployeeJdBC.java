package com.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeJdBC {
	//inserting the row using method
	 public static  void insert(Statement stmt)throws Exception
	  {
		  String query="INSERT INTO EMPLOYEE1 VALUES(1,'AJAY',35000),(2,'ANKIT',45000),(3,'AMIT',55000)";
		  stmt.executeUpdate(query);
		  System.out.println("Row is inserted"); 
	  }
	 
	 //Updating the row using method
	 public static void update(Statement stmt)throws Exception
	 {
		 String query="Update Employee1 set Salary=65000 Where ID=3";
		 stmt.executeUpdate(query);
		 System.out.println("Row is updated");
	 }
	 
	 //Method to delete
	 public static void delete(Statement stmt)throws Exception
	 {
		 String query="DELETE FROM EMPLOYEE1 WHERE ID=3";
		 stmt.executeUpdate(query);
		 System.out.println("Row is deleted");
		 
	 }
	 public static void select(Statement stmt)throws Exception
	 {
		 String query="SELECT * FROM EMPLOYEE1";
		 ResultSet rs=stmt.executeQuery(query);
		 while(rs.next())
		 {
			 System.out.println( rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		 }
		 
	 }
	
	 //main method
	
    public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		
		//Establishing connection 
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established"+con);
		
		//creating a statement
		Statement stmt=con.createStatement();
		//creating a scanner class to accept the input from the user
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter i for insertion ,2 for update,3 for delete,4 forselect"
					+ "and any other number for to terminate ");
			int choice=scan.nextInt();
			if(choice==1)
			{
				insert(stmt);
			}
			else if(choice==2)
			{
				update(stmt);
			}
			else if(choice==3)
			{
				delete(stmt);
			}
			else if(choice==4)
			{
				select(stmt);
			}
			else
			{
				System.out.println("Invalid choice");
				System.exit(0);
			}
		}
		
		}
}
