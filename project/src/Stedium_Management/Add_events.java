package Stedium_Management;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Add_events extends JFrame {

	private JPanel contentPane;
	private JTextField textPromo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_events frame = new Add_events();
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(1,33,63));
					frame.setTitle("ROYAL MINT");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Add_events() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(458, 319, 1000, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldate = new JLabel("Date");
		lbldate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbldate.setForeground(Color.cyan);
		lbldate.setBounds(104, 79, 53, 29);
		contentPane.add(lbldate);
		
		JTextArea textArea = new JTextArea();
		///textArea.setText("DD-MM-YY");
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textArea.setBounds(169, 78,166, 37);
		contentPane.add(textArea);
		
		JLabel lblevents = new JLabel("Events");
		lblevents.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblevents.setBounds(584, 80, 70, 40);
		lblevents.setForeground(Color.cyan);
		contentPane.add(lblevents);
		
		
		JLabel lbld = new JLabel("(yyyy-mm-dd)");
		lbld.setBounds(80, 111, 100, 16);
		lbld.setForeground(Color.cyan);
		contentPane.add(lbld);
		
		JTextArea textEvents = new JTextArea();
		textEvents.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textEvents.setBounds(657, 78,166, 37);
		contentPane.add(textEvents);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblSeats.setBounds(104, 196, 56, 36);
		lblSeats.setForeground(Color.cyan);
		contentPane.add(lblSeats);
		
		JTextArea textSeats = new JTextArea();
		textSeats.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		textSeats.setBounds(169, 196, 166, 37);
		contentPane.add(textSeats);
		
		
		JTextArea textTime = new JTextArea(); textTime.setFont(new Font("Segoe UI",Font.PLAIN, 20)); 
		textTime.setBounds(657, 199, 166, 37);
		contentPane.add(textTime);
		 
		
		
		JLabel lblTime = new JLabel("Time"); lblTime.setFont(new Font("Segoe UI",Font.PLAIN, 20)); 
		lblTime.setBounds(584, 200, 56, 29);
		lblTime.setForeground(Color.cyan);
		contentPane.add(lblTime);
		 		
		JRadioButton rdbtnAddPromo = new JRadioButton("Add promo");
		rdbtnAddPromo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAddPromo.isSelected())
				{
					textPromo.setEnabled(true);
				}
				else
				{
					textPromo.setEnabled(false);
				}
				
			}
		});
		rdbtnAddPromo.setBounds(400, 255, 125, 25);
		contentPane.add(rdbtnAddPromo);
		
		textPromo = new JTextField();
		textPromo.setEnabled(false);
		textPromo.setBounds(400, 285, 125, 25);
		//textField.setEnabled(false);
		contentPane.add(textPromo);
		textPromo.setColumns(10);
		
		JButton btnNewButton = new JButton("Add\r\n\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnNewButton,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
					String date=textArea.getText();
					String seats=textSeats.getText();
					String time=textTime.getText();
					String event=textEvents.getText();
					if(rdbtnAddPromo.isSelected())
					{
						String promo=textPromo.getText();
						try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							
						
							String query="INSERT INTO events values('"+event+"','"+date+"','"+time+"','"+seats+"','"+promo+"')";
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","28082004 abhi");
							Statement st=con.createStatement();
							st.executeUpdate(query);
							
							con.close();
						}
						catch(Exception f)
						{
							System.out.println(f);
						}
					}	
					else
					{
						
						try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							
						
							String query="INSERT INTO events values('"+event+"','"+date+"','"+time+"','"+seats+"',NULL)";
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","28082004 abhi");
							Statement st=con.createStatement();
							st.executeUpdate(query);
							
							con.close();
						}
						catch(Exception f)
						{
							System.out.println(f);
						}
					}
						
					JOptionPane.showMessageDialog(btnNewButton, "Event is successfully added");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
							AdminLogin al=new AdminLogin();
							al.setTitle("ROYAL MINT");
							al.setVisible(true);
						}
					});
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		btnNewButton.setBounds(400, 350, 125, 60);
		btnNewButton.setForeground(Color.red);
		contentPane.add(btnNewButton);
	}
}

