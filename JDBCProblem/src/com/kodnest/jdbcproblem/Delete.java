package com.kodnest.jdbcproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Delete {
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
		
		//creating the statement
		Statement stmt=connection.createStatement();
		
		//executing the sql statement
		
		String str= "delete from employee01 where id=1";
		stmt.execute(str);
		System.out.println("success-");
	}

}
