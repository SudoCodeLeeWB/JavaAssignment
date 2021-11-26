package UIPack;
import javax.swing.*;
import java.awt.*;

public class ProductIntro extends Gui1{

private JPanel p5 ,p6;
private JButton addCart , buynow;
private JLabel pName , pPrice , pQuantity ,image ; 
private JLabel aName , aPrice , aQuantity;
private ImageIcon  bigImage;

  
//resize the product image

    public ProductIntro(){
    
        // adjust the size and change image inside of the pannel -5
        p5= new JPanel();
        p5.setBounds(180  , 185 , 1300 ,  800 );
        p5.setBackground(Color.blue);
        bigImage = new ImageIcon(""); //TODO : get the image file from the database. 
        image = new JLabel(bigImage);
        p5.add(image);

    

        // layout the buttons and labels. - p6
        p6= new JPanel();
        p6.setBounds(1500  , 185 , 400 ,  800 );
        p6.setBackground(Color.red);

         addCart       = new JButton();
         buynow = new JButton();

         pName  = new JLabel("Product Name");
         pPrice  = new   JLabel("Product Price");
         pQuantity  = new  JLabel("Quantity");

         // the a label values must be from the product information. -> change the "" part.
         aName  = new JLabel("Product Name");
         aPrice  = new   JLabel("Product Price");
         aQuantity  = new  JLabel("Quantity");


            p6.add(addCart);
            p6.add(buynow);
            p6.add(pName);
            p6.add(aName);
            p6.add(pPrice);
            p6.add(aPrice);
            p6.add(pQuantity);
            p6.add(aQuantity);



        add(p5);
        add(p6);


    }


}
