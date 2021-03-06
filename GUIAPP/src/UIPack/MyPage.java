package UIPack;

import javax.swing.*;


import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;
import logic.functions.StaticDatas;

public class MyPage extends Gui1{

    private JPanel panel;
    // side buttons are shopping cart , Customer service, mypage.
    private boolean adminUser = false;
    //global
    private JButton btnGoBack;
    // for mp
    private JLabel  lblUserName , lblUserId , lblUserPassword , lblUserAdderss ,AUserName, AUserId;
    private JTextField txtPassword , txtAddress ; 
    private JButton btnSaveChanges ;
    
    // for shoppingCart
    private JLabel lblProductName , lblProductSize , lblProductPrice , lblProdctQuantity , lblTotalPrice; 

    private ArrayList<JLabel> pNames = new ArrayList<JLabel>();
    private ArrayList<JLabel> pSizes = new ArrayList<JLabel>();
    private ArrayList<JLabel> pPrices = new ArrayList<JLabel>();
    private ArrayList<JLabel> pQuantity = new ArrayList<JLabel>();
    private ArrayList<JLabel> pTotalPrice = new ArrayList<JLabel>();

    


    /*ScreenNumbers : 
    0 : Main page - user information screen
    1: User shopping cart
    2 : Customer Service 
    3 : View all product
    4:  view all orders 
    5: view all Users
    */

    // constructor
    public MyPage(){

        btnSide1.setVisible(true);
        btnSide2.setVisible(true);
        btnSide4.setVisible(false);
        btnSide5.setVisible(false);
        searchBox.setVisible(true);
        btnSearch.setVisible(true);
    
        btnSide1.setText("My information");
        btnSide2.setText("My shopping cart");
        btnSide3.setVisible(false);


        // check if the admin is login -> change the side menus. 
        if(StaticDatas.loginUser == StaticDatas.users.get(0)){
            adminUser = true;
            // when clicking the button Side 2 and 3 -> different panel drawing. 
            btnSide2.setText("Add Product");
            btnSide3.setVisible(true);
            btnSide3.setText("Delete Product");
            btnSide4.setVisible(true);
            btnSide4.setText("view all Users");

        }
                btnSide1.addActionListener(this);
                btnSide2.addActionListener(this);
                btnSide3.addActionListener(this);
                btnSide4.addActionListener(this);
                btnSide5.addActionListener(this);
               


        // #5 pannel - basic  pannel drawing. + for MyPage
         panel = new JPanel();
         panel.setBounds(400  , 185 , 1450 ,  800 );
         // goback button is for every panel. 
         btnGoBack = new JButton("Go Back");
         btnGoBack.addActionListener(this);
         add(panel);
         drawMP();


// the default page is My information.
// for each buttons clicked . redraw the pannel. 

}


private void drawMP(){

    panel.removeAll(); // clear the panel

    panel.setBackground(Color.white);
    panel.setLayout(new GridLayout(5,2));
    lblUserName  = new JLabel("User Name"); 
    lblUserId = new JLabel("User ID");
    lblUserPassword = new JLabel("User Password");
    lblUserAdderss = new JLabel("User Address");
    AUserName= new JLabel();
    AUserName.setText(StaticDatas.loginUser.userName);
    AUserId= new JLabel(StaticDatas.loginUser.id); 
    txtPassword  = new JTextField(StaticDatas.loginUser.password);
    txtAddress  = new JTextField(StaticDatas.loginUser.address);
    btnSaveChanges = new JButton("Save Changes");
    // btnGoBack = new JButton("Go Back");
    btnSaveChanges.addActionListener(this);
   // btnGoBack.addActionListener(this);

  panel.add(lblUserName);
  panel.add(AUserName);
  panel.add(lblUserId);
  panel.add(AUserId);
  panel.add(lblUserPassword);
  panel.add(txtPassword);
  panel.add(lblUserAdderss);
  panel.add(txtAddress);
  panel.add(btnSaveChanges);
  panel.add(btnGoBack);

  panel.revalidate();
  panel.repaint();
System.out.println(adminUser);

}

private void  drawShopingCart(){
    
    System.out.println("Draw the shoppingCart Part");
    
    panel.removeAll(); // clear the panel
    panel.setBackground(Color.white);
    panel.setLayout(new GridLayout(StaticDatas.loginUser.cart.orderList.size()+1,5));

    lblProductName = new JLabel("Product Name");
    lblProductSize  = new JLabel("Product Size");
    lblProductPrice   = new JLabel("Product Price");
    lblProdctQuantity   = new JLabel("Product Quantity");
    lblTotalPrice = new JLabel("Product total Price");

            panel.add(lblProductName);
            panel.add(lblProductSize);
            panel.add(lblProductPrice);
            panel.add( lblProdctQuantity);
            panel.add(lblTotalPrice);     
            // get  the data from the staticData class. // use the for loop. 
           
            for (int i=0; i<StaticDatas.loginUser.cart.orderList.size(); i++){ 
            pNames.add(i,new JLabel());
            pNames.get(i).setText(StaticDatas.loginUser.cart.orderList.get(i).prod.productName);
            panel.add(pNames.get(i));

            pSizes.add(i,new JLabel());
            pSizes.get(i).setText(StaticDatas.loginUser.cart.orderList.get(i).size);
            panel.add(pSizes.get(i));

            pPrices.add(i,new JLabel());
            pPrices.get(i).setText(Integer.toString(StaticDatas.loginUser.cart.orderList.get(i).prod.productPrice));
            panel.add(pPrices.get(i));

            pQuantity.add(i,new JLabel());
            pQuantity.get(i).setText(StaticDatas.loginUser.cart.orderList.get(i).quantity);
            panel.add(pQuantity.get(i));
        
            // make quantity to int value
            int pricedata = Integer.valueOf(StaticDatas.loginUser.cart.orderList.get(i).quantity); 
            pTotalPrice.add(i,new JLabel());
            pTotalPrice.get(i).setText(Integer.toString(StaticDatas.loginUser.cart.orderList.get(i).prod.productPrice * pricedata ));
            panel.add(pTotalPrice.get(i));
            
        }
        
             panel.revalidate();
             panel.repaint();

}

private void drawViewAllProduct(){
   
    panel.removeAll(); // clear the panel

    panel.setBackground(Color.red);
    panel.setLayout(new GridLayout(5,3));

    
      panel.revalidate();
      panel.repaint();
    

}

private void drawViewAllOrders(){}

private void drawViewAllUsers(){}

 
public void actionPerformed(ActionEvent e){  
 

// if the save chage button is clicked  in MyPage
    if(btnSaveChanges.equals(e.getSource())) {

        // override the user information.
        // the index of the user
        StaticDatas.users.get(StaticDatas.findIdxOfUser(StaticDatas.loginUser)).password = txtPassword.getText();
        StaticDatas.users.get(StaticDatas.findIdxOfUser(StaticDatas.loginUser)).address = txtAddress.getText();
        int reply = JOptionPane.showConfirmDialog(null, "Data saved!", "Alert", JOptionPane.OK_OPTION);
        
    }

    // go back to previous screen
    if(btnGoBack.equals(e.getSource())){
        MainPage mp = new MainPage();
        mp.setVisible(true);
        this.setVisible(false);
    }


    // add multiple conditions for the Admin 
    if(btnSide1.equals(e.getSource())) {
        System.out.println("The drawMP func");
            drawMP();
    }

    // checkinng the admin user
    if (adminUser == true){

        if(btnSide2.equals(e.getSource())) {
            drawViewAllProduct();
        }

        if(btnSide3.equals(e.getSource())) {
            drawViewAllOrders();
        }

        if(btnSide4.equals(e.getSource())) {
            drawViewAllUsers();
        }

    }else if(adminUser == false){

        if(btnSide2.equals(e.getSource())) {
            drawShopingCart();
        }

    }



}










}
