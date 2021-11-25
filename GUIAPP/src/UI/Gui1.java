package UI;

import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame{
  private JLabel lblLogo, lblWelcome;
  private ImageIcon imglogo;
  private JButton btnMypage, btnShopcart, btnCustomer;
  private JPanel p1,p2;

  public Gui1(){
    setTitle("First Page");
    setSize(1920,1080); // full size for 1080p
    imglogo = new ImageIcon(getClass().getResource(""));
    lblLogo = new JLabel(imglogo);
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
    p1.setBounds(20,20,150,150);
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