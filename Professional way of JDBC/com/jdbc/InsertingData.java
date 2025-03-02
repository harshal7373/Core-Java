package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.connection.connect;
// Class InsertingData
public class InsertingData {

// Main Method
	public static void main(String[] args)throws Exception {
		
// Connection Called from com.connection package
		Connection con = connect.getconnection();
// Scanner 		
		Scanner s1 = new Scanner(System.in);
// PreparedStatement		
		PreparedStatement pst = con.prepareStatement("insert into register values(?,?,?,?,?)");
		
		System.out.println("Enter name, Email, Password, Gender, and city respectively");
		
		pst.setString(1, s1.next());
		pst.setString(2, s1.next());
		pst.setString(3, s1.next());
		pst.setString(4, s1.next());
		pst.setString(5, s1.next());
		
		System.out.println("Data Inserted");
		
		pst.executeUpdate();

		
	}
}
