package UIPack;
import javax.swing.*;

import logic.functions.StaticDatas;

import java.awt.*;
import java.awt.event.*;  

/*TODO : 
 adjust the location of search box in pannel  #4 
 resize the logo in pannel  #1 *
 add buttons to work - use action handeler. 

*/


public class Gui1 extends JFrame implements ActionListener  {
  protected JLabel lblLogo, lblWelcome;
  protected JLabel lblUserName;
  protected ImageIcon imglogo;
  // These buttons are not used -> chane it later?
  protected JButton btnMypage, btnShopcart, btnCustomer;
  protected JPanel p1,p2,p3,p4;

  // for pannel #3
public JButton btnSide1 , btnSide2 , btnSide3 , btnSide4 ,btnSide5 ;

// for search box - pannel #4
protected JTextField searchBox;
protected JButton btnSearch;






    // constructor for gui1 
  public Gui1(){
    setTitle("First Page");
    setSize(1920,1080); // full size for 1080p
    imglogo = new ImageIcon("lib/logo.png"); //TODO :: add logo file here  + change the size of the image file
    lblLogo = new JLabel(imglogo);
   
    // btns and lbls for panel 2
    lblWelcome = new JLabel("Welcome !");
    lblUserName = new JLabel("");
    btnMypage = new JButton("My Page");
   btnShopcart = new JButton("Shopping cart");
   btnCustomer = new JButton("Customer Service");


   //btn for pannel #3
   btnSide1 = new JButton("Side1");
   btnSide2 = new JButton("Side2");
   btnSide3 = new JButton("Side3");
   btnSide4 = new JButton("Side4");
   btnSide5 = new JButton("Side5");


  // for the side button, 
   btnSide1.setText("Recommended");
   btnSide2.setText("Newly added");
   btnSide3.setText("On Sale");
   btnSide4.setText("top");
   btnSide5.setText("pants");


   //textfield for pannel #4 :search box
   searchBox = new JTextField("Search Product" , 100);
   btnSearch = new JButton("go!");


   lblWelcome.setBounds(100, 30, 30,30);
   // btnMypage.setBounds(1700,50,100,30);
  //	btnCustomer.setBounds(1700,170,100,30);

    //pannel  for logo image #1
    // : adjust the size of a image 
    p1 = new JPanel();
    p1.setBounds(20,20,150,150);
    p1.setBackground(Color.RED);
    p1.add(lblLogo);


    // pannel for user info #2
    p2 = new JPanel();
    p2.setBounds(1700,20,200,150);
    p2.setBackground(Color.cyan);

    p2.setLayout(new GridLayout(5,1));
    p2.add(lblWelcome );
    p2.add(lblUserName );
    p2.add(btnMypage );
    p2.add(btnShopcart );
    p2.add(btnCustomer);

    if(StaticDatas.loginUser == null){
      btnMypage.setVisible(false);
      btnShopcart.setVisible(false);
      btnCustomer.setVisible(false);
      
    }






    //pannel for  menu box (recommendation button() #3
    p3 = new JPanel();
    p3.setBounds(20,180,150,800);
    p3.setLayout(new GridLayout(15,1));
    // including buttons inside the panel
    p3.add(btnSide1);
    p3.add(btnSide2);
    p3.add(btnSide3);
    p3.add(btnSide4);
    p3.add(btnSide5);

    p3.setBackground(Color.yellow); // for checking the area of the panel
    


    // pannel for search box #4

    p4 = new JPanel();
    p4.setBounds(180,20,1500,150);
    p4.setBackground(Color.green);

    p4.setLayout(new FlowLayout());
    p4.add(searchBox);
    p4.add(btnSearch);


    // pannel for  main content #5
    //-> removed
    /*
    p5 = new JPanel();
    p5.setBounds(180,180,1700,800);
    p5.setBackground(Color.pink);
    */


// for action listener
btnSide1.addActionListener(this);
btnSide2.addActionListener(this);
btnSide3.addActionListener(this);
btnSide4.addActionListener(this);
btnSide5.addActionListener(this);
btnSearch.addActionListener(this);



    // adding pannel inside of the JFrame
    add(p1);
    add(p2);
    add(p3);
    add(p4);
  //  add(p5);

    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);

  }




// write the events and actions . 
public void actionPerformed(ActionEvent e){  
 
}













}  




  

