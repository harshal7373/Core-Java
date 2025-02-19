package CreateStatementMethod;

// 1 - import package
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create_Statement {

	public static void main(String[] args) throws Exception {

// 2 - Load Driver		
		Class.forName("com.mysql.cj.jdbc.Driver");

// 3 - Establish the connection		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db", "root", "Occult_2005");

// 4 - Create the statement
		Statement st = con.createStatement();

// 5 - Execute the Querry (ExecuteQuerry)  &  Process Result (ResultSet)
		ResultSet rst = st.executeQuery("select * from register");

		while (rst.next()) {

			String name = rst.getString(1);
			String email = rst.getString(2);
			String password = rst.getString("Password");
			String gender = rst.getString("Gender");
			String city = rst.getString("City");

			System.out.println("Name: " + name + ", Email: " + email + ", Password: " + password + ", Gender: " + gender
					+ ", City: " + city);

		}
		
		rst.close();
		st.close();

	}
}
