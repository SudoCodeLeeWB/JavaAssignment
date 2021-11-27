//finsihed

package UIPack;

import java.awt.event.*;
import javax.swing.*;
import logic.functions.StaticDatas;


public class RegisterPage extends JFrame implements ActionListener {
    private JButton btnReg, btnBack;
    private JLabel lblUser, lblPass, lblID;
    private JTextField txtUser, txtPass , txtID;
    private JPanel p;
    
    // constructor
    public RegisterPage(){
        btnReg = new JButton("Register");
        btnBack = new JButton("Back");
        lblUser = new JLabel("Username");
        lblPass = new JLabel("Password");
        lblID = new JLabel("ID");

        txtUser = new JTextField(15);
        txtPass = new JTextField(15);
        txtID = new JTextField(15);
        p = new JPanel();

        btnReg.setBounds(50,50,100,30);
        btnBack.setBounds(50,170,100,30);
        p.setBounds(100,100,200,200);

        lblPass.setBounds(60,60,200,200);
        setTitle("Register Page");
        setSize(400,400);
        p.add(lblUser);
        p.add(txtUser);
        p.add(lblID);
        p.add(txtID);
        p.add(lblPass);
        p.add(txtPass);
        p.add(btnReg);
        p.add(btnBack);
        btnReg.addActionListener( this);
        btnBack.addActionListener(this);
        add(p);
        setLayout(null);    
    }
    
    public void actionPerformed(ActionEvent ae) {

         if(btnReg.equals(ae.getSource())) {
             System.out.println("Making a new account");
             String username = txtUser.getText();
             String password = txtPass.getText();
             String ID = txtID.getText();
             Boolean check;
             check = StaticDatas.addUser(username, ID, password);

             if (check = false){
             int reply = JOptionPane.showConfirmDialog(null, "Username Taken", "Alert", JOptionPane.OK_OPTION);
             txtUser.setText("");
             txtPass.setText("");
             }else if (check = true){
                 int reply = JOptionPane.showConfirmDialog(null, "Registered!", "Alert", JOptionPane.OK_OPTION);
             }
            }
    
        
        // connecting the pages - connect with login page. 
        if(btnBack.equals(ae.getSource())) {
            loginPage g1 = new loginPage();
            g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            g1.setVisible(true);
            this.setVisible(false);
        }    
    }


}
