package UIPack;
import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame{
  private JLabel lblLogo, lblWelcome, lblMyPage, lblShopCart, lblCustomer;
  private ImageIcon imglogo;
  private JButton btnMypage, btnShopcart, btnCustomer;
  private JPanel p1,p2,p3,p4,p5;

  public Gui1(){
    setTitle("First Page");
    setSize(1920,1080); // full size for 1080p
    imglogo = new ImageIcon(getClass().getResource(""));
    lblLogo = new JLabel(imglogo);
    lblWelcome = new JLabel("Welcome biatch!");
    lblMyPage = new JLabel("My Page");
    lblShopCart = new JLabel("Shopping Cart");
    lblCustomer = new JLabel("Customer");
    btnMypage = new JButton("My Page");
    btnShopcart = new JButton("Shopping cart");
    btnCustomer = new JButton("Customer Service");
    lblWelcome.setBounds(100, 30, 30,30);
    btnMypage.setBounds(1700,50,100,30);
	btnCustomer.setBounds(1700,170,100,30);

    p1 = new JPanel();
    p1.setBounds(20,20,150,150);
    p1.setBackground(Color.RED);
    p1.add(lblLogo);

    p2 = new JPanel();
    p2.setBounds(1700,20,200,150);
    p2.setBackground(Color.cyan);
    lblMyPage.setBounds(20, 100, 30,30);
    p2.add(lblWelcome);
    p2.add(lblMyPage);
    p2.add(lblShopCart);
    p2.add(lblCustomer);

    p3 = new JPanel();
    p3.setBounds(20,180,150,800);
    p3.setBackground(Color.yellow);
    
    p4 = new JPanel();
    p4.setBounds(180,20,1500,150);
    p4.setBackground(Color.green);
    
    p5 = new JPanel();
    p5.setBounds(180,180,1700,800);
    p5.setBackground(Color.pink);
    
    add(p1);
    add(p2);
    add(p3);
    add(p4);
    add(p5);
    setLayout(null);
  }
  
}
