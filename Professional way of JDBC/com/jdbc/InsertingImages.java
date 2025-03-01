package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.connection.connect;

// Class InsertingImages
public class InsertingImages {

// Main Method
	public static void main(String[] args) throws Exception {

// Connection Called from com.connection package
		Connection con = connect.getconnection();
// Querry 
		String querry = "insert into images(pic) values(?)";
// PreparedStatement
		PreparedStatement pst = con.prepareStatement(querry);

// JFileChooser is a part of swing
		JFileChooser jfc = new JFileChooser();

		jfc.showOpenDialog(null);
		
		File file = jfc.getSelectedFile();
		
		FileInputStream fis = new FileInputStream(file);
		
		pst.setBinaryStream(1,fis,fis.available());

		pst.executeUpdate();
		
		JOptionPane.showMessageDialog(null, "Saved");
		
	}
}
