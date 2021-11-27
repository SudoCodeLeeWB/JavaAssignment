package logic.functions;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


// this file is used for declaring the static ArrayList and  Queues. 
// this file also includes the adding account , adding/deleting/editing Product, Array of ordre sets. 
// will use the txt file to store the data , add the static function to save/retirve the data from the txt files.

public class StaticDatas {


 
    // account related Arraylist
    static ArrayList<User> users = new ArrayList<User>();

    // product related ArrayList
    static ArrayList<Product> products  = new ArrayList<Product>();

    //OrderStack for the Owner to view. 

    // called when it init app
public  static void  restoreUser(){
        int i =1;
        String userName ="";
        String id="";
        String password="";

        try {
            File myObj = new File("lib/Users.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                    switch (i){

                        case 1:
                         userName = myReader.nextLine();
                            i++;
                            break;

                        case 2:
                         id = myReader.nextLine();
                            i++;
                            break;

                        case 3:
                         password= myReader.nextLine();
                         User newUser = new User(userName, id, password);
                         users.add(newUser);
                         i =1;
                         break;

                            default: break;
                    }
            }
            myReader.close();

             // for debug:
             for (int k =0; k < users.size(); k++){
             System.out.println(users.get(k));
            }

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred, File does not exits. ");
            e.printStackTrace();
          }

    }
    
public void  restoreProduct(){



}


// called when exit app
public void  saveUser(){}
public void  saveProduct(){}


// called when registering a new user / adding new prduct
public void addUser(){}
public void addProduct(){}    


}
