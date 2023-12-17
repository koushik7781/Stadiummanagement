package Stedium_Management;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.color.*;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setTitle("ROYAL MINT");
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(1,33,63));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AdminLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 46));
		lblNewLabel.setForeground(Color.orange);
		lblNewLabel.setBounds(373, 42, 273, 93);
		contentPane.add(lblNewLabel);

		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(481, 170, 281, 68);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(481, 286, 281, 68);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 31));
		lblUsername.setBounds(250, 166, 193, 52);
		lblUsername.setForeground(Color.CYAN);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.CYAN);
		lblPassword.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 31));
		lblPassword.setBounds(250, 286, 193, 52);
		contentPane.add(lblPassword);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(545, 392, 162, 73);
		btnNewButton.setForeground(Color.red);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String ustr=textField.getText();
				String pstr=passwordField.getText();
				
				
				if( ustr.equals("virat") && pstr.equals("virat973"))
				{
					dispose();
					Admin_host ah=new Admin_host();
					ah.setTitle("ROYAL MINT");
					ah.setVisible(true);
					JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
				}
			}
		});
	
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("User Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin us=new Userlogin();
				us.setTitle("ROYAL MINT");
				us.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1.setBounds(250, 387, 193, 83);
		btnNewButton_1.setForeground(Color.red);
		contentPane.add(btnNewButton_1);
		
	

	}

}
