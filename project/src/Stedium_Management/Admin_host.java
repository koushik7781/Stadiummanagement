package Stedium_Management;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class Admin_host extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_host frame = new Admin_host();
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(1,33,63));
					frame.setTitle("ROYAL MINT");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Admin_host() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(200, 200, 175, 100);
		menuBar.setBackground(Color.cyan);
		contentPane.add(menuBar);
		
		JMenu mnAddEvents = new JMenu("Add events");
		mnAddEvents.setFont(new Font("Segoe UI", Font.BOLD, 30));
		mnAddEvents.setForeground(Color.red);
		
		menuBar.add(mnAddEvents);
		
		JMenu mnNewMenu = new JMenu("Add Cricket");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mnNewMenu);
		
		JMenuItem mntmAddOdi = new JMenuItem("Add ODI");
		mntmAddOdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddOdi);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Test");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmAddT = new JMenuItem("Add T20");
		mntmAddT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\STDM.jpg"));
				ae.setTitle("Add_events");
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddT);
		
		JMenuItem mntmAddRanji = new JMenuItem("Add Ranji");
		mntmAddRanji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAddRanji);
		
		JMenuItem mntmAddFootball = new JMenuItem("Add Football");
		mntmAddFootball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mntmAddFootball.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mntmAddFootball);
		
		JMenuItem mntmAddOthers = new JMenuItem("Add Others");
		mntmAddOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_events ae=new Add_events();
				ae.setVisible(true);
			}
		});
		mntmAddOthers.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAddEvents.add(mntmAddOthers);
		
		
		
	
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(btnLogout,"Are you sure?");
				//JOptionPane.setRootFrame(null);
				if(a==JOptionPane.YES_OPTION){
				dispose();
				MainScreen ms=new MainScreen();
				ms.setTitle("ROYAL MINT");
				ms.setVisible(true);
				}
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLogout.setBounds(700, 100, 200, 50);
		btnLogout.setForeground(Color.red);
		contentPane.add(btnLogout);
		
	
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium2.png"));
		label.setBounds(600, 0, 700, 700);
		contentPane.add(label);
		
	}
}
