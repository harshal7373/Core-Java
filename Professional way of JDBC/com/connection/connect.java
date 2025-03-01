package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {

	private static Connection con;
	
	public static Connection getconnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db", "root","Occult_2005");
			
		return con;
		
	}
}
