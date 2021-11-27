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
    System.out.println("main page!");

    btnSide1.setText("Recommended");
    btnSide2.setText("Newly added");
    btnSide3.setText("On Sale");
    btnSide4.setText("top");
    btnSide5.setText("pants");

    p5 = new JPanel();
    p5.setBounds(180,180,1700,800);
    p5.setBackground(Color.pink);
   p5.setLayout(new GridLayout(5  , 2 ));

   System.out.println(StaticDatas.products.size());
 
   /*
    for(int i = 0; i < StaticDatas.products.size(); i++) {

        //set the button's name to product's names.
        buttons.get(i).setText(StaticDatas.products.get(i).productName);
        p5.add(buttons.get(i));
    }
*/
    
    add(p5);

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

    if (btnSearch.equals(e.getSource())){
        // look for the keywords inside the product class, and display it inside the screen. 

    }


}  

}
