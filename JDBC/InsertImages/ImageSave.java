package InsertImages;

import java.io.FileInputStream;
import java.sql.*;

// Class ImageSave
public class ImageSave {

// Main Method
	public static void main(String[] args) throws Exception, SQLException{
		
// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
// Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Occult_2005");
		
// Create a preparedStatement
		PreparedStatement pst1 = con.prepareStatement("insert into images (pic) values(?)");
		
// FileInputStream
		FileInputStream fis = new FileInputStream("C:\\Users\\RAHUL\\OneDrive\\Desktop\\college.jpg");
			
// SetBinaryStream
		pst1.setBinaryStream(1, fis, fis.available());
		
// Execute the preparedStatement
		pst1.executeUpdate();
		
		System.out.println("Image Inserted");
		
	}
}
