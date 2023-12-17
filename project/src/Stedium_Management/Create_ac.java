package Stedium_Management;

import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Create_ac extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField mob;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_ac frame = new Create_ac();
					frame.setVisible(true);
					frame.setTitle("ROYAL MINT");
					frame.getContentPane().setBackground(new Color(1,33,63));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public Create_ac() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewUserRegister = new JLabel("New User Register");
		lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewUserRegister.setForeground(Color.orange);
		lblNewUserRegister.setBounds(362, 52, 325, 50);
		contentPane.add(lblNewUserRegister);
		
		JLabel lblName = new JLabel("First name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(58, 152, 99, 43);
		lblName.setForeground(Color.cyan);
		contentPane.add(lblName);
		
		JLabel lblLast = new JLabel("Last name");
		lblLast.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLast.setBounds(58, 243, 110, 29);
		lblLast.setForeground(Color.cyan);
		contentPane.add(lblLast);
		
		JLabel lblEmail = new JLabel("Email\r\n address");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(58, 324, 124, 36);
		lblEmail.setForeground(Color.cyan);
		contentPane.add(lblEmail);
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		firstname.setBounds(214, 151, 228, 50);
		lblName.setForeground(Color.cyan);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lastname.setBounds(214, 235, 228, 50);
		lblName.setForeground(Color.cyan);
		contentPane.add(lastname);
		lastname.setColumns(10);
		
		email = new JTextField();

		email.setFont(new Font("Tahoma", Font.PLAIN, 32));
		email.setBounds(214, 320, 228, 50);
		lblName.setForeground(Color.cyan);
		contentPane.add(email);
		email.setColumns(10);
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 32));
		username.setBounds(707, 151, 228, 50);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUser.setBounds(542, 159, 99, 29);
		lblUser.setForeground(Color.cyan);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPass.setBounds(542, 245, 99, 24);
		lblPass.setForeground(Color.cyan);
		contentPane.add(lblPass);
		
		JLabel lblMN = new JLabel("Mobile number");
		lblMN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMN.setBounds(542, 329, 139, 26);
		lblMN.setForeground(Color.cyan);
		contentPane.add(lblMN);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
		mob.setBounds(707, 320, 228, 50);
		contentPane.add(mob);
		mob.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(707, 235, 228, 50);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String First_name=firstname.getText();
				String last=lastname.getText();
				String emailadd=email.getText();
				String user1=username.getText();
				String mb=mob.getText();
				int len=mb.length();
				String pass1=passwordField.getText();
				
				String msg=""+First_name;
				msg+=" \n";	
				if(len==10)
				{
					JOptionPane.showMessageDialog(btnNewButton,"Welcome, "+msg+"Your account is sucessfully created");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
							Userlogin us=new Userlogin();
							us.setTitle("ROYAL MINT");
							us.setVisible(true);
						}
					});
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
				}
		
				
				try{
			
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					String query="INSERT INTO account values('"+First_name+"','"+last+"','"+user1+"','"+pass1+"','"+emailadd+"','"+mb+"')";
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","28082004 abhi");
					Statement sta=con1.createStatement(); 
					sta.executeUpdate(query);
					
				}
				catch(Exception f)
				{
					System.out.println(f.getMessage());
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(345, 397, 139, 50);
		btnNewButton.setForeground(Color.red);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Already Have Account ? Sign in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin us=new Userlogin();
				us.setTitle("ROYAL MINT");
				us.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(297, 474, 435, 50);
		btnNewButton_1.setForeground(Color.red);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Reset\r\n\r\n\r\n");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBounds(542, 397, 139, 50);
		btnNewButton_2.setForeground(Color.red);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname.setText("");
				lastname.setText("");
				email.setText("");
				username.setText("");
				mob.setText("");
				passwordField.setText("");
			}
		});
		contentPane.add(btnNewButton_2);
	}
}