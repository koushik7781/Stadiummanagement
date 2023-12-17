package Stedium_Management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class MainScreen extends JFrame {

	private JPanel contentPane;


	MainScreen(String s){
		super(s);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainScreen frame = new MainScreen();
					frame.setTitle("ROYAL MINT");
					frame.setVisible(true);
					frame.setBackground(Color.black);
					frame.getContentPane().setBackground(new Color(1,33,63));
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	public MainScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1020, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ROYAL MINT");
		lblNewLabel.setForeground(Color.orange);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 46));
		lblNewLabel.setBounds(350, 0, 590, 103);
		contentPane.add(lblNewLabel);
		
		JButton AdminBtn = new JButton("Admin Login");
		AdminBtn.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 32));
		AdminBtn.setBackground(Color.cyan);
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdminLogin ad=new AdminLogin();
				ad.setTitle("ROYAL MINT");
				ad.setVisible(true);
			}
		});
		AdminBtn.setBounds(130, 200, 250, 100);
		contentPane.add(AdminBtn);
		
		JButton UserBtn = new JButton("User Login");
		UserBtn.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 32));
		UserBtn.setBackground(Color.cyan);
		UserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Userlogin ad=new Userlogin();
				ad.setTitle("ROYAL MINT");
				ad.setVisible(true);
			}
		});
		UserBtn.setBounds(650, 200, 250, 100);
		contentPane.add(UserBtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium2.png"));
		lblNewLabel_1.setBounds(385, 120, 500, 500);
		contentPane.add(lblNewLabel_1);
	}
}
