package logic.functions;

public class User {
    
    // user has ShoppingCart
    // user has Own Id and Password -> modify after merge.
    // User has userName , Address , Payment method.


    public String userName , id , password ;
    public  ShoppingCart cart; 


    public void setCart(){
        this. cart = new ShoppingCart();

    }

    // constructor -> called when adding a new user. 
    public User(String userName , String id ,  String password ){

        this.userName = userName;
        this.id = id;
        this.password = password;
        // debug - show the user information. 
        System.out.println(userName + "  " + id + " " + password);

    }

    




}
