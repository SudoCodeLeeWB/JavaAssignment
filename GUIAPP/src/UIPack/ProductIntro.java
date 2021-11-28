package UIPack;
import javax.swing.*;

import logic.functions.Product;
import logic.functions.StaticDatas;
import java.awt.*;
import java.awt.event.*;

public class ProductIntro extends Gui1{

private JPanel p5 ,p6;
private JButton btnAddCart , btnBuyNow, btnGoBack;
private JLabel pName , pPrice , pQuantity ,image ; 
private JLabel aName , aPrice ;
private ImageIcon  bigImage;
private int price;
private JTextField quant;
  
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
        Product selectedProduct = StaticDatas.productQuery(selectedProductName);


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
         btnBuyNow = new JButton("Buy now");
         btnGoBack = new JButton("Go back");

         pName  = new JLabel("Product Name");
         pPrice  = new   JLabel("Product Price");
         pQuantity  = new  JLabel("Quantity");



         aName  = new JLabel("Product Name");
         String name="";
         name = selectedProduct.productName;
         aName.setText(name );

         System.out.println(name + "The name value \n");
         aPrice  = new  JLabel("Product Price");
         price = selectedProduct.productPrice;
         aPrice.setText(Integer.toString(price) );

         System.out.println(price + "The price value \n");

        //TODO: add a textbox or other thing to record+ change the quantity
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

            p6.add(btnAddCart);
            p6.add(btnBuyNow);
            p6.add(btnGoBack);
            btnAddCart.addActionListener(this);
            btnBuyNow.addActionListener(this);
            btnGoBack.addActionListener(this);



        add(p5);
        add(p6);


    }


    // things changing when clicked the button in this page. 
    public void actionPerformed(ActionEvent e){

    //get the data from the ui and store it inside of the shopping cart. 
    // we have three buttons here - > go back , add to cart , buy now. 

    if( btnAddCart.equals(e.getSource())) {}
    if( btnBuyNow.equals(e.getSource())) {}

    if( btnGoBack.equals(e.getSource())) {

        MainPage p = new MainPage();
        p.setVisible(true);
        this.setVisible(false);
        
    }






    }







}
