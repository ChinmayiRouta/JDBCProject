package com.kodnest.jdbcproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection Information
		String url="jdbc:mysql://localhost/kodnest";
		String username="root";
		String password="root";
		
		//Establishing connection
		Connection connection=DriverManager.getConnection(url, username, password);
		System.out.println(connection+"connection success");
		
		String str= "insert into employee01 values(?,?)";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID");
		int id=scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter the name");
		String name=scan.nextLine();
		
		//creating the statement
		//Statement stmt=connection.prepareStatement(password);
		PreparedStatement statement=connection.prepareStatement(str);
		statement.setInt(1, id);
		statement.setString(2,name);
		int exeuteUpdate =statement.executeUpdate();
		System.out.println("success-"+exeuteUpdate);
		
	}

}

