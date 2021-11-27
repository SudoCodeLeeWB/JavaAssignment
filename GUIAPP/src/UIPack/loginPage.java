package UIPack;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class loginPage extends Gui1  {

    private JPanel p5;
    private JButton  login ,register;
    private  ImageIcon logoImg;
    private JLabel logoLabel;
    private JTextField idField , passwordField;


     public loginPage(){

        p5 = new JPanel();
        p5.setBounds(700,220, 525,664);
        p5.setBackground(Color.white);
        login = new JButton("Login");
        register = new JButton("Register");
        logoImg = new ImageIcon("lib/logo.png");
        logoLabel = new JLabel(logoImg);
        idField = new JTextField("Enter your ID ");
        passwordField = new JTextField("Enter your Password ");

        // TODO: modify the layout and the buttons later
        p5.setLayout(new GridLayout(5,1));
        p5.add(logoLabel);
        p5.add(idField);
        p5.add(passwordField);
        p5.add(login);
        p5.add(register);
        
        add(p5);

     }
    


public void actionPerformed(ActionEvent e){  
 

}


  
}