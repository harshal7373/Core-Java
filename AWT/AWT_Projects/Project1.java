package AWT_Projects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Project1 {

	private JFrame frame;
	private JTextField stuRno;
	private JTextField stuName;
	private JTextField stuGender;
	private JTextField stuMarks;
	private JTable table;

	Connection con;
	
	void connect() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/AWT_db";
		String username = "root";
		String password = "Occult_2005";
		
        con = DriverManager.getConnection(url,username,password);
		
	}
	
	
	void loadTableData() {
	    try {
	        String query = "SELECT * FROM student";
	        PreparedStatement pst = con.prepareStatement(query);
	        java.sql.ResultSet rs = pst.executeQuery();

	        DefaultTableModel model = (DefaultTableModel) table.getModel();
	        model.setRowCount(0); // Clear existing rows

	        while (rs.next()) {
	            model.addRow(new Object[]{
	                rs.getInt("Rollno"),
	                rs.getString("Name"),
	                rs.getString("Gender"),
	                rs.getFloat("Marks")
	            });
	        }

	        pst.close();
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project1 window = new Project1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Project1() throws ClassNotFoundException, SQLException {
		initialize();
		connect();
		loadTableData();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBounds(100, 100, 816, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT CRUD OPERATIONS");
		lblNewLabel.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblNewLabel.setBounds(265, 10, 323, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 72, 90, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(22, 100, 90, 18);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(22, 128, 90, 18);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Marks:");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBackground(Color.WHITE);
		lblNewLabel_1_3.setBounds(22, 156, 90, 18);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		stuRno = new JTextField();
		stuRno.setBounds(106, 72, 125, 21);
		frame.getContentPane().add(stuRno);
		stuRno.setColumns(10);
		
		stuName = new JTextField();
		stuName.setColumns(10);
		stuName.setBounds(106, 102, 125, 21);
		frame.getContentPane().add(stuName);
		
		stuGender = new JTextField();
		stuGender.setColumns(10);
		stuGender.setBounds(106, 130, 125, 21);
		frame.getContentPane().add(stuGender);
		
		stuMarks = new JTextField();
		stuMarks.setColumns(10);
		stuMarks.setBounds(106, 156, 125, 21);
		frame.getContentPane().add(stuMarks);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					int sRno = Integer.parseInt(stuRno.getText());
					String sName = stuName.getText();
					String sGender = stuGender.getText();
					float marks = Float.parseFloat(stuMarks.getText());
					
					
				PreparedStatement pst1 = con.prepareStatement("insert into student values(?,?,?,?)");
				
				pst1.setInt(1, sRno);
				pst1.setString(2, sName);
				pst1.setString(3, sGender);
				pst1.setFloat(4, marks);
				
				pst1.executeUpdate();
				
				loadTableData();
				
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnInsert.setFont(new Font("Swis721 BT", Font.BOLD, 20));
		btnInsert.setBounds(296, 100, 104, 31);
		frame.getContentPane().add(btnInsert);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			try {
				
				int sRno = Integer.parseInt(stuRno.getText());
				String sName = stuName.getText();
				String sGender = stuGender.getText();
				float marks = Float.parseFloat(stuMarks.getText());
				
				
			PreparedStatement pst2 = con.prepareStatement("update student set name=?, gender=?, marks=? where rollno=?");
			
			pst2.setInt(4, sRno);
			pst2.setString(1,sName);
			pst2.setString(2, sGender);
			pst2.setFloat(3, marks);
			
			pst2.executeUpdate();
			
			loadTableData();
			
			
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		btnUpdate.setFont(new Font("Swis721 BT", Font.BOLD, 20));
		btnUpdate.setBounds(437, 100, 104, 31);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					int sRno = Integer.parseInt(stuRno.getText());
					
					PreparedStatement pst3 = con.prepareStatement("delete from student where rollno=?");
			
					pst3.setInt(1, sRno);
					
					pst3.executeUpdate();
					
					loadTableData();
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("Swis721 BT", Font.BOLD, 20));
		btnDelete.setBounds(575, 100, 104, 31);
		frame.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 233, 703, 240);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"Roll no", "Name", "Gender", "Marks"
			}
		));
	}
}
