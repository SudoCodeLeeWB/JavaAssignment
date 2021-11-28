package logic.functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.*;

public class addProduct extends JFrame implements ActionListener  {
	
	private JButton btnReg, btnBack;
	private JLabel lblUser, lblPass;
	private JTextField txtUser, txtPass;
	private JPanel p;
	
	public addProduct(){
		btnReg = new JButton("Add Product");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btnReg.equals(e.getSource())) {
			System.out.println("Hello");
			String productName = txtUser.getText();
			String itemPrice = txtPass.getText();
			File file = new File("D:\\Lim Phang Choon\\my files\\Userinfo.txt");
			boolean found = false;
			try {
				Scanner scan = new Scanner(file);
				while(scan.hasNextLine()) {
				productName = scan.nextLine();
				if (productName.startsWith(productName)) {
				int reply = JOptionPane.showConfirmDialog(null, "Product name already added", "Alert", JOptionPane.OK_OPTION);
				if (reply == 0)
				txtUser.setText("");
				txtPass.setText("");
				}
				else {
					
				}
				}
			} catch (FileNotFoundException fe) {
				// TODO Auto-generated catch block
				System.out.println("File not Found!");
			}
		
	}

	}
}


