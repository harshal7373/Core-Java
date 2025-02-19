package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Prepared_Statement {

	public static void main(String[] args)throws Exception {
		
		Scanner s1 = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/JDBC_db";
		String username = "root";
		String password = "Occult_2005";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
//		PreparedStatement pst1 = con.prepareStatement("insert into register values('Madhur', 'madhur@gmail.com', 'Occult', 'Male','Pune')");
//		pst1.executeUpdate();
		
		PreparedStatement pst2 = con.prepareStatement("insert into register values(?,?,?,?,?)");
		
		System.out.println("Enter name, Email, Password, Gender, and city respectively");		
		String name = s1.next();
		String email =s1.next();
		String pass =s1.next();
		String gender =s1.next();
		String city =s1.next();
		
		
		pst2.setString(1, name);
		pst2.setString(2, email);
		pst2.setString(3, pass);
		pst2.setString(4, gender);
		pst2.setString(5, city);
		
		pst2.executeUpdate();
	}
}
