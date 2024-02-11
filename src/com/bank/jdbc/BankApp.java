package com.bank.jdbc;
import java.sql.*;
public class BankApp {

	public static void main(String[] args) {
		try {
		String url="jdbc:mysql://localhost:3306/jdbc_database";
		String username="root";
		String password="Jesus@07";
		
		String query1="Update bank set balance=balance-10000 WHERE ACCNO=11 FROM BANK";
		String query2="Update bank set balance=balance-10000 WHERE ACCNO=33 FROM BANK";
		
		//establishing the connection
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		
		//creating the statement
		Statement stmt1=con.createStatement();
		Statement stmt2=con.createStatement();
		
		
		//executing the query using statement
		stmt1.execute(query1);
		stmt2.execute(query2);

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}