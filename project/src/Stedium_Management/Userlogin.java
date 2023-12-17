package Stedium_Management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Userlogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogin frame = new Userlogin();
					frame.setTitle("ROYAL MINT");
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(1,33,63));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Userlogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 46));
		lblNewLabel.setForeground(Color.orange);
		lblNewLabel.setBounds(373, 42, 273, 93);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 32));
		textField.setBounds(481, 170, 281, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 32));
		passwordField.setBounds(481, 286, 281, 68);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 31));
		lblUsername.setForeground(Color.cyan);
		lblUsername.setBounds(204, 178, 193, 52);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 31));
		lblPassword.setForeground(Color.cyan);
		lblPassword.setBounds(204, 294, 193, 52);
		contentPane.add(lblPassword);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
		btnNewButton.setForeground(Color.red);
		btnNewButton.setBounds(481, 387, 113, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0,j=0;
				String ustr=textField.getText();
				String pstr=passwordField.getText();
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","28082004 abhi");
					String query="select * from account where UserName='"+ustr+"' and Password='"+pstr+"'";
					Statement st=con.createStatement();
					ResultSet x=st.executeQuery(query);
					if(x.next())
					{
						dispose(); User_host uh=new
								 User_host(); uh.setTitle("ROYAL MINT"); uh.setVisible(true);
								  JOptionPane.showMessageDialog(btnNewButton,
								  "You have successfully logged in");
						
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Invalid credentials");
					}
				}
				catch(Exception f)
				{
					System.out.println(f);
				}			
			}
		});
	
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin al=new AdminLogin();
				al.setTitle("ROYAL MINT");
				al.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 30));
		btnNewButton_1.setBounds(204, 419, 216, 83);
		btnNewButton_1.setForeground(new Color(49,104,121));
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Create new account");
		btnNewButton_2.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Create_ac ca = new Create_ac();
				ca.setTitle("ROYAL MINT");
				ca.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(481, 470, 281, 52);
		btnNewButton_2.setForeground(Color.red);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Reset ");
		btnNewButton_3.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");

			}
		});
		btnNewButton_3.setBounds(649, 387, 113, 52);
		btnNewButton_3.setForeground(Color.red);
		contentPane.add(btnNewButton_3);
	
	
	}

}
