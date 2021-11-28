package start;
//main page for  executing the program

import javax.swing.*;
import UIPack.*;
import java.awt.*;
import logic.functions.StaticDatas;

public class Main {
	public static void main(String[] args) {
		// getting user information from txt file
		StaticDatas.restoreUser();
		StaticDatas.restoreProduct();
		loginPage a = new loginPage();
		//saving user information in txt file
		

		 a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 a.setVisible(true);
		/*
		ProductIntro gp4 = new ProductIntro();
		gp4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp4.setVisible(true);
		*/
	}
}

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.SwingConstants;

// class Main {
//   public static void main(String[] args) {
//     JFrame frame = new JFrame("Hello world");
//     frame.setSize(300, 300);
//     frame.setLocation(5, 5);
//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     JLabel label = new JLabel("Hello world", SwingConstants.CENTER);
//     frame.add(label);

//     frame.show();
//   }
// }