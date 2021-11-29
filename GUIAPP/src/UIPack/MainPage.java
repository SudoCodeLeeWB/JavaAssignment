package UIPack;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import logic.functions.StaticDatas;
import java.awt.*;

public class MainPage extends Gui1 {

    private JPanel p5;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();
    
public MainPage() {
    setTitle("Main Page");
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
        buttons.get(i).addActionListener(this);

    }

    
    add(p5);


        // for panel #2
        // change the text of the buttons for the owner. 
        lblUserName.setText(StaticDatas.loginUser .userName);
        btnMypage.setVisible(true);
        btnShopcart.setVisible(true);
        btnCustomer.setVisible(true);
        btnLogOut.setVisible(true);
        
 System.out.println("end of mainPage constructor ");
 System.out.println("\n check the button on p5 status ");


btnMypage.addActionListener(this);
btnShopcart.addActionListener(this);
btnCustomer.addActionListener(this);
btnLogOut.addActionListener(this);

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
            System.out.println("The search button is clicked");
        
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
                 buttons.get(i).addActionListener(this);
                 p5.add(buttons.get(i));
         
             }
             // redraw the pannel
             p5.revalidate();
             p5.repaint();

             System.out.println(buttons.size() + "The size of the refreshed buttons array \n");


        } 
    
        
        // if a specific product button is clicked :  GO TO THE product specific page. 
        for (int i = 0; i< buttons.size(); i++){
            System.out.println("\n check the loop enter");
            if (buttons.get(i).equals(e.getSource())){
                System.out.println("\nThe product button is clicked");
       
               // insert the code for new page - product specific page. 
                   // make the ui first. 
                   ProductIntro productInt = new ProductIntro(buttons.get(i).getText());
                   productInt.setVisible(true);
                   this.setVisible(false);
               }
        }

// button clicked for - p2 user informations


if(btnMypage.equals(e.getSource())) {
    // change the page to Mypage 
    MyPage page = new MyPage();
    page.setVisible(true);
    this.setVisible(false);
    
 }
    
//TODO : add LogOut button.
if(btnLogOut.equals(e.getSource())){

    // add saveProduct 
    StaticDatas.saveUser();
    StaticDatas.saveProduct();
    StaticDatas.loginUser = null;
    loginPage lp = new loginPage();
    lp.setVisible(true);
    this.setVisible(false);

}



}

}

