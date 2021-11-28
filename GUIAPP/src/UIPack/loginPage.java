package UIPack;

import javax.swing.*;
import logic.functions.StaticDatas;
import java.awt.*;
import java.awt.event.*;


public class loginPage extends Gui1  {

    private JPanel p5;
    private JButton  btnLogin ,btnRegister;
    private  ImageIcon logoImg;
    private JLabel logoLabel;
    private JTextField txtId , txtPwd;


     public loginPage(){
      setTitle("Login Page");

        p5 = new JPanel();
        p5.setBounds(700,220, 525,664);
        p5.setBackground(Color.white);
        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");
        logoImg = new ImageIcon("lib/logo.png");
        logoLabel = new JLabel(logoImg);
        txtId = new JTextField("Enter your ID ");
        txtPwd = new JTextField("Enter your Password ");

        // TODO: modify the layout and the buttons later
        p5.setLayout(new GridLayout(5,1));
        p5.add(logoLabel);
        p5.add(txtId);
        p5.add(txtPwd);
        p5.add(btnLogin);
        p5.add(btnRegister);
         
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        add(p5);

     }
    


public void actionPerformed(ActionEvent e){  
 
   // connecting the pages - connect with register page
  
   // if Register button is clicked
   if(btnRegister.equals(e.getSource())) {
      RegisterPage g1 = new RegisterPage();
      g1.setVisible(true);
      this.setVisible(false);
   }


      // if Login button is clicked
      if(btnLogin.equals(e.getSource())) {
         // for debug
         System.out.println(txtId.getText() + "   " + txtPwd.getText());
        
         if(  StaticDatas.login(txtId.getText() , txtPwd.getText()) == true){
           
            int reply = JOptionPane.showConfirmDialog(null, "Login Successful", "Alert", JOptionPane.OK_OPTION);
            MainPage p1 = new MainPage();
            p1.setVisible(true);
            this.setVisible(false);

         }else{
            int reply = JOptionPane.showConfirmDialog(null, "Wrong ID / Password", "Alert", JOptionPane.OK_OPTION);
         }
      
      
      }

}
}


  
