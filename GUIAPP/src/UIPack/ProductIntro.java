package UIPack;
import javax.swing.*;
import logic.functions.*;

import logic.functions.Product;
import logic.functions.StaticDatas;
import java.awt.*;
import java.awt.event.*;

public class ProductIntro extends Gui1{

private JPanel p5 ,p6;
private JButton btnAddCart , btnGoBack;
private JLabel pName , pPrice , pQuantity ,image , lblChooseSize , lblASize; 
private JLabel aName , aPrice ;
private ImageIcon  bigImage;
private int price;
private JTextField quant;
private JButton btnSmall , btnMedium , btnLarge;
private char size;
private Product selectedProduct ;
//resize the product image

    public ProductIntro(String selectedProductName){


        btnSide1.setVisible(false);
        btnSide2.setVisible(false);
        btnSide3.setVisible(false);
        btnSide4.setVisible(false);
        btnSide5.setVisible(false);
        searchBox.setVisible(false);
        btnSearch.setVisible(false);


    
        // get the product from the 
        selectedProduct = StaticDatas.productQuery(selectedProductName);

        // adjust the size and change image inside of the pannel -5
        p5= new JPanel();
        p5.setBounds(180  , 185 , 1300 ,  800 );
        p5.setBackground(Color.blue);
        bigImage = new ImageIcon(""); //TODO : get the image file from the database.  // from the image icon!
        image = new JLabel(bigImage);
        p5.add(image);

    

        // layout the buttons and labels. - p6
        p6= new JPanel();
        p6.setBounds(1500  , 185 , 400 ,  800 );
        p6.setBackground(Color.yellow);

         btnAddCart = new JButton("ADD CART");
         btnGoBack = new JButton("Go back");
         btnSmall = new JButton("Small");
         btnMedium = new JButton("Medium");
         btnLarge = new JButton("Large");



         pName  = new JLabel("Product Name");
         pPrice  = new   JLabel("Product Price");
         pQuantity  = new  JLabel("Quantity");
         lblChooseSize = new JLabel("Choose Size");
         lblASize = new JLabel("size");



         aName  = new JLabel("Product Name");
         String name="";
         name = selectedProduct.productName;
         aName.setText(name );

         System.out.println(name + "The name value \n");
         aPrice  = new  JLabel("Product Price");
         price = selectedProduct.productPrice;
         aPrice.setText(Integer.toString(price) );

         System.out.println(price + "The price value \n");

        //TODO: change the layout .
         // the a label values must be from the product information. -> change the "" part.
         quant  = new  JTextField("Enter Quantity");

            //TODO : Set the layout. 
            p6.setLayout(new GridLayout(8,2));
        
            p6.add(pName);
            p6.add(aName);

            p6.add(pPrice);
            p6.add(aPrice);

            p6.add(pQuantity);
            p6.add(quant);
            p6.add(lblChooseSize);
            p6.add(lblASize);

            p6.add(btnAddCart);
            p6.add(btnGoBack);

            p6.add(btnSmall);
            p6.add(btnMedium);
            p6.add(btnLarge);

            btnAddCart.addActionListener(this);
            btnGoBack.addActionListener(this);
            btnSmall.addActionListener(this);
            btnMedium.addActionListener(this);
            btnLarge.addActionListener(this);


        add(p5);
        add(p6);


    }


    // things changing when clicked the button in this page. 
    public void actionPerformed(ActionEvent e){

        //buttons for selecting the size of the product. 

        if( btnSmall.equals(e.getSource())) {
            size = 'S';
            lblASize.setText("Small");
        }

        if( btnMedium.equals(e.getSource())) {
            size = 'M';
            lblASize.setText("Medieum");
        }

        if( btnLarge.equals(e.getSource())) {
            size = 'L';
            lblASize.setText("Large");
        }



    //get the data from the ui and store it inside of the shopping cart. 
    if( btnAddCart.equals(e.getSource())) {

        // getting the information from the ui and storing it into the Static cart. 
            Order custOrder = new Order(selectedProduct , quant.getText() , size);
            StaticDatas.loginUser.cart.addProduct(custOrder);
            // showing that the order is added into the shopping cart. 
            int reply = JOptionPane.showConfirmDialog(null, "Order Recorded", "Alert", JOptionPane.OK_OPTION);

    }


    // going back to the previous page. 
    if( btnGoBack.equals(e.getSource())) {

        MainPage p = new MainPage();
        p.setVisible(true);
        this.setVisible(false);

    }






    }







}
