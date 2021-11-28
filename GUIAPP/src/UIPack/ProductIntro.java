package UIPack;
import javax.swing.*;

import logic.functions.Product;
import logic.functions.StaticDatas;
import java.awt.*;
import java.awt.event.*;

public class ProductIntro extends Gui1{

private JPanel p5 ,p6;
private JButton btnAddCart , btnBuyNow;
private JLabel pName , pPrice , pQuantity ,image ; 
private JLabel aName , aPrice , aQuantity;
private ImageIcon  bigImage;
private int price;
  
//resize the product image

    public ProductIntro(String selectedProductName){
    
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

         pName  = new JLabel("Product Name");
         pPrice  = new   JLabel("Product Price");
         pQuantity  = new  JLabel("Quantity");



         aName  = new JLabel("Product Name");
         String name="";
         name = selectedProduct.productName;
         aName.setText(name);
         System.out.println(name + "The name value \n");
         aPrice  = new   JLabel("Product Price");
         price = selectedProduct.productPrice;
         aName.setText(Integer.toString(price));
         System.out.println(price + "The price value \n");

        //TODO: add a textbox or other thing to record the quantity
         // the a label values must be from the product information. -> change the "" part.
         aQuantity  = new  JLabel("Quantity");


            p6.setLayout(new GridLayout(8,1));
        
            p6.add(pName);
            p6.add(aName);

            p6.add(pPrice);
            p6.add(aPrice);

            p6.add(pQuantity);
            p6.add(aQuantity);

            p6.add(btnAddCart);
            p6.add(btnBuyNow);
            btnAddCart.addActionListener(this);
            btnBuyNow.addActionListener(this);
       



        add(p5);
        add(p6);


    }


    // things changing when clicked the button in this page. 
    public void actionPerformed(ActionEvent e){











    }







}
