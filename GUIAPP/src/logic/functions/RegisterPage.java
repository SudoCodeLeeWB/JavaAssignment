package logic.functions;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

import UIPack.Gui1;

public class RegisterPage extends JFrame implements ActionListener {
	private JButton btnReg, btnBack;
	private JLabel lblUser, lblPass;
	private JTextField txtUser, txtPass;
	private JPanel p;
	ArrayList<User> userList = new ArrayList<User>();
	
	public RegisterPage(){
		btnReg = new JButton("Register");
		btnBack = new JButton("Back");
		lblUser = new JLabel("Username");
		lblPass = new JLabel("Password");
		txtUser = new JTextField(15);
		txtPass = new JTextField(15);
		p = new JPanel();
		btnReg.setBounds(50,50,100,30);
		btnBack.setBounds(50,170,100,30);
		p.setBounds(100,100,200,200);
		lblPass.setBounds(60,60,200,200);
		setTitle("Register Page");
		setSize(400,400);
		p.add(lblUser);
		p.add(txtUser);
		p.add(lblPass);
		p.add(txtPass);
		p.add(btnReg);
		p.add(btnBack);
		btnReg.addActionListener( this);
		btnBack.addActionListener(this);
		add(p);
		setLayout(null);
		
		
		// Use the file library
		// Read the file
		// For each line in the file, add to the userList
		// 
		
	}
	
	
	
	public void actionPerformed(ActionEvent ae) {
		if(btnReg.equals(ae.getSource())) {
			System.out.println("Hello");
			String username = txtUser.getText();
			String password = txtPass.getText();
			File file = new File("D:\\Lim Phang Choon\\my files\\Userinfo.txt");
			boolean found = false;
			try {
				Scanner scan = new Scanner(file);
				while(scan.hasNextLine());
				username = scan.nextLine();
				if (username.startsWith(username));
				int reply = JOptionPane.showConfirmDialog(null, "Username Taken", "Alert", JOptionPane.OK_OPTION);
				if (reply == 0)
				txtUser.setText("");
				txtPass.setText("");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not Found!");
			}
			for (User user : userList) {
				if (user.GetUsername().equals(username)) {
					int reply = JOptionPane.showConfirmDialog(null, "Username Taken", "Alert", JOptionPane.OK_OPTION);
					if (reply == 0)
					txtUser.setText("");
					txtPass.setText("");
					}else {
						int reply = JOptionPane.showConfirmDialog(null, "Registered!", "Alert", JOptionPane.OK_OPTION);
						if (reply == 0)
							userList.add(new User(username, password));
							
					}
			}
		}
		if(btnBack.equals(ae.getSource())) {
			Gui1 g1 = new Gui1();
			g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			g1.setVisible(true);
		}
	}

}
