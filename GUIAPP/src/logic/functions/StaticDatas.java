package logic.functions;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


// this file is used for declaring the static ArrayList and  Queues. 
// this file also includes the adding account , adding/deleting/editing Product, Array of ordre sets. 
// will use the txt file to store the data , add the static function to save/retirve the data from the txt files.

public class StaticDatas {

    // the User variable to check the current login user. 
    public static User loginUser;


    // account related Arraylist
    public static ArrayList<User> users = new ArrayList<User>();

    // product related ArrayList
   public static ArrayList<Product> products  = new ArrayList<Product>();

   // The search Results array
   public static ArrayList<Product> searchResults  = new ArrayList<Product>();

    //OrderStack for the Owner to view.  // not used!
    public static ArrayList<ShoppingCart> orderStack = new ArrayList<ShoppingCart>();


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


          } catch (FileNotFoundException e) {
            System.out.println("An error occurred, File does not exits. ");
            e.printStackTrace();
          }

    }

public static void  restoreProduct(){

    int i =1;
    String productName ="" , keyword1 =""  , keyword2 ="" ;
    int productPrice =0;
    String imageName ="";

    try {
        File myObj = new File("lib/Products.txt");
        Scanner myReader = new Scanner(myObj); 

        while (myReader.hasNextLine()) {
            // the product must have three keywords.

                switch (i){

                    case 1:
                     productName = myReader.nextLine();
                    i++;
                    break;

                    case 2:
                     productPrice = Integer.valueOf(myReader.nextLine());
                    i++;
                    break;
                    
                    case 3:
                     imageName = myReader.nextLine();
                    i++;
                    break;

                     case 4:
                      keyword1 = myReader.nextLine();
                     i++;
                     break;
  
                    case 5:
                     keyword2 = myReader.nextLine();
                     Product newProduct = new Product(productName,keyword1,keyword2 , productPrice , imageName);
                     products.add(newProduct);
                     i =1;
                     break;

                        default: break;
                }
        }
        myReader.close();

      } catch (FileNotFoundException e) {
        System.out.println("An error occurred, File does not exits. ");
        e.printStackTrace();
      }

}

// called when exit app
public static void  saveUser (){

    FileWriter myWriter;
     try {
        myWriter = new FileWriter("lib/Users.txt"); 

        for (int i = 0;  i < users.size() ; i++){
            String name = users.get(i).userName;
            System.out.println(name);
            String iD = users.get(i).id;
            System.out.println(iD);
            String pwd = users.get(i).password;
            System.out.println(pwd);
            
                myWriter.write(name);
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(iD);
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(pwd);
                myWriter.write(System.getProperty( "line.separator" ));
    
                System.out.println("User Status recorded");
        }

            // for debug:
            for (int k =0; k < users.size(); k++){
            System.out.println(users.get(k));
            }

        myWriter.close();
    }

                 catch (IOException e1) {
                    e1.printStackTrace();
                }
               
}

//TODO
public static void  saveProduct(){


    FileWriter myWriter;
     try {
        myWriter = new FileWriter("lib/Products.txt"); 

        for (int i = 0;  i < products.size() ; i++){
            String ProductName = products.get(i).productName;
            String KeyWord1 = products.get(i).keyword1;
            String KeyWord2 = products.get(i).keyword2;
            int price  = products.get(i).productPrice;
            String imageName = products.get(i).imageName;

            
                myWriter.write(ProductName);
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(Integer.toString(price));
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(KeyWord1);
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(KeyWord2);
                myWriter.write(System.getProperty( "line.separator" ));
                myWriter.write(imageName);
                myWriter.write(System.getProperty( "line.separator" ));

                System.out.println("product Status recorded");
        }

            // for debug:
            for (int k =0; k < users.size(); k++){
            System.out.println(users.get(k));
            }

        myWriter.close();
    }

                 catch (IOException e1) {
                    e1.printStackTrace();
                }
               

}


// called when registering a new user / adding new prduct
// returns the boolean value to indicate the success or failure of the registration. 
public static boolean addUser( String userName, String id, String password ){

// first, check whether the same user already exists.
for (int i = 0;  i < users.size() ; i++){
    if (userName == users.get(i).userName)
    return false;
}
//second make a new user Class and insert it at the end of the array.
    User newUser = new User(userName, id, password);

    // .add reutrns if the adding was successful.
    return users.add(newUser);

}



public static boolean login(String id ,String password){

    for (int i = 0;  i < users.size() ; i++){
        if( (users.get(i).id .equals(id)) && (users.get(i).password.equals(password))){
            StaticDatas.loginUser = users.get(i);
            return true;
        }
    }
 return false;
}

public static Product productQuery(String name){

    for(int i=0 ; i<products.size() ; i++){

        if ( name.equals(products.get(i).productName)){

            return products.get(i);

        }

    }

return new Product();

}

public static  int findIdxOfUser(User user){
    int answer= 0;
        for(int i =0 ;  i < users.size() ; i++){
            if ( users.get(i) == user){
                answer = i;
            }
        }

    return answer;
}


}
