package UIPack;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import logic.functions.StaticDatas;
import java.awt.*;

public class MainPage extends Gui1 {


    protected JPanel p5;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();
    
public MainPage() {
    System.out.println("main page!");

    p5 = new JPanel();
    p5.setBounds(180,180,1700,800);
    p5.setBackground(Color.pink);
   p5.setLayout(new GridLayout(2  , StaticDatas.products.size() /2 ));

   System.out.println(StaticDatas.products.size()+ "The size of the total product\n");

    for(int i = 0; i < StaticDatas.products.size(); i++) {
        //set the button's name to product's names.
        buttons.add(i,new JButton());
        buttons.get(i).setText(StaticDatas.products.get(i).productName);
        p5.add(buttons.get(i));

    }

    
    add(p5);


        // for panel #2
        // change the text of the buttons for the owner. 
        lblUserName.setText(StaticDatas.loginUser .userName);
        btnMypage.setVisible(true);
        btnShopcart.setVisible(true);
        btnCustomer.setVisible(true);
        
 System.out.println("end of mainPage constructor ");

}


    public void actionPerformed(ActionEvent e){
                
      if(btnSide1.equals(e.getSource())) {
        searchBox.setText("Recommended");
        // same effect like clicked the search button. 
     }
     if(btnSide2.equals(e.getSource())) {
        searchBox.setText("Newly added");
    }
    if(btnSide3.equals(e.getSource())) {
        searchBox.setText("On Sale");
    }
    if(btnSide4.equals(e.getSource())) {
        searchBox.setText("Top");
    }
    if(btnSide5.equals(e.getSource())) {
        searchBox.setText("Pants");
    }
    
        if( btnSearch.equals(e.getSource())) {
            System.out.println("The button is clicked");
        
          // look for the products that has the same string from the box -> compare it with the keywoard
          // get the elements from the product array . 
        
          //clear the search result. 
          StaticDatas.searchResults.clear();
        
          String searchWord = searchBox.getText();
        
          for (int i =0;  i <StaticDatas. products.size();  i++) {
              String pName = StaticDatas.products.get(i).productName;
              String pKey1 = StaticDatas.products.get(i).keyword1;
              String pKey2 = StaticDatas.products.get(i).keyword2;
        
                       if(  (searchWord.equals(pName)  )   ||   (searchWord.equals(pKey1)) || (searchWord.equals(pKey2)) ){
                         StaticDatas.searchResults.add(StaticDatas.products.get(i));
                       }
            }
        
            // change the result of the search! -> code goes in here.
            // remake the pannel
            buttons.clear();
            p5.removeAll(); // clear the panel

            p5.setLayout(new GridLayout(2  , StaticDatas.searchResults.size() /2 ));

            System.out.println(StaticDatas.searchResults.size() + "The size of the search results \n");
         
             for(int i = 0; i < StaticDatas.searchResults.size(); i++) {
        
                 //set the button's name to product's names.
                 buttons.add(i,new JButton());
                 buttons.get(i).setText(StaticDatas.searchResults.get(i).productName);
                 p5.add(buttons.get(i));
         
             }
             // redraw the pannel
             p5.revalidate();
             p5.repaint();
        } 
    
    
        /* not working - please check
        // if a specific product button is clicked : 
        for (int i = 0; i< StaticDatas.products.size(); i++)
        if (buttons.get(i).equals(e.getSource())){
         System.out.println("\nThe product button is clicked");
    

        // insert the code for new page - product specific page. 
            // make the ui first. 
        
        }
        */

}

}
