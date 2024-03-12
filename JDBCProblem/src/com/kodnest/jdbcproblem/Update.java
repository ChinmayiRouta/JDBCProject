package com.kodnest.jdbcproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection Information
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="root";
		
		//executing the sql statement
		String str= "update employee01 set name=? where id=?";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the new name to be set");
		String name=s.nextLine();
		
		System.out.println("Enter the ID value where the "+"name needs to updated");
		int newid=s.nextInt();
		
		//Establishing connection
		Connection connection=DriverManager.getConnection(url, username, password);
		System.out.println(connection+"connection success");
		
		//creating the statement
		//Statement stmt=connection.createStatement();
		PreparedStatement pt=connection.prepareStatement(str);
		pt.setInt(2, newid);
		pt.setString(1,name);
		
		int executeUpdate=pt.executeUpdate();
		System.out.println("success-");
	
	}
}
