package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperation {

	public static void main(String[] args) throws Exception {

		Scanner s1 = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/JDBC_db";
		String username = "root";
		String password = "Occult_2005";
		Connection con = DriverManager.getConnection(url, username, password);

		while (true) {
			System.out.println(
					"1. Table Display \n2. Insert in Table \n3. Update Table \n4. Delete Particular row \n5. Exit");
			int num = s1.nextInt();
			switch (num) {

			case 1:

// to display the table		
				Statement st = con.createStatement();

				ResultSet rst = st.executeQuery("Select * from register");

				while (rst.next()) {

					String name = rst.getString(1);
					String email = rst.getString(2);
					String pass = rst.getString(3);
					String gender = rst.getString(4);
					String city = rst.getString(5);

					System.out.println("Name: " + name + ", Email: " + email + ", Password: " + pass + ", Gender: "
							+ gender + ", City: " + city);

				}

				break;

			case 2:

// Inserting in table

				PreparedStatement pst1 = con.prepareStatement("insert into register values(?,?,?,?,?)");

				System.out.println("Enter name, email, password, gender, city respectively");

				pst1.setString(1, s1.next());
				pst1.setString(2, s1.next());
				pst1.setString(3, s1.next());
				pst1.setString(4, s1.next());
				pst1.setString(5, s1.next());

				pst1.executeUpdate();

				System.out.println("Data Inserted");

				break;

			case 3:

// Update Particular row

				PreparedStatement pst3 = con
						.prepareStatement("update register set email=?, password=?, gender=?, city=? where name=?");

				System.out.println("Enter name to Update");
				pst3.setString(5, s1.next());

				System.out.println("Enter new email, password, gender, city");
				pst3.setString(1, s1.next());
				pst3.setString(2, s1.next());
				pst3.setString(3, s1.next());
				pst3.setString(4, s1.next());

				pst3.executeUpdate();

				break;

			case 4:

// Delete particular row

				PreparedStatement pst2 = con.prepareStatement("delete from register where name=?");

				System.out.println("Enter name to delete that data");
				pst2.setString(1, s1.next());

				pst2.executeUpdate();

				System.out.println("Data Deleted");

				break;

			case 5:

// Exit the loop

				System.exit(0);

			default:
				// Default
				System.out.println("Invalid Choice, Please enter correct choice !");
				break;

			}

		}

	}
}
