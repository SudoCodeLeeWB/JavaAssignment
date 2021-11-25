package UIPack;

import javax.swing.*;
import java.awt.*;


/*TODO : 
1.  Make the screen not resizable.
2.  Insert the logo in  imglogo 
3. Change the userName into a variable


*/


public class Gui1 extends JFrame{
  private JLabel lblLogo, lblWelcome;
  private ImageIcon imglogo;
  private JButton btnMypage, btnShopcart, btnCustomer;
  private JPanel p1,p2;

  public Gui1(){
    setTitle("First Page");
    setSize(1280,720);  // full size for 720p


// TODO  #2 : insert the file dir in this ""
    imglogo = new ImageIcon(getClass().getResource("")); 
    lblLogo = new JLabel(imglogo);
    
    //TODO :  #3 Change the UserName! into  a global variable -> if the user login then change the "name"
    lblWelcome = new JLabel("Welcome UserName!");

    // btnMypage = new JButton("My Page");
    btnMypage = new JButton("My Page") {
        {
            setSize(100, 45);
            setMaximumSize(getSize());
        }
    };

    btnShopcart = new JButton("Shopping cart");
    btnCustomer = new JButton("Customer Service");

    p1 = new JPanel();
    p1.setBounds(0,0,150,80);
    p1.setBackground(Color.RED);
    p1.add(lblLogo);

    p2 = new JPanel();
    p2.setBounds(400,20,200,200);
    p2.add(lblWelcome);
    p2.add(btnMypage);
    p2.add(btnShopcart);
    p2.add(btnCustomer);

    add(p1);
    add(p2);
    setLayout(null);
  }
}