package logic.functions;

public class User {
    
    // user has ShoppingCart
    // user has Own Id and Password -> modify after merge.
    // User has userName , Address , Payment method.


    public String userName , id , password , paymentMethod ;
    public  ShoppingCart cart;
    public int userCode;
    public static int StaticUserCode =1000;


    // generating the user code. 
    public int setUserCode(){

        int number = StaticUserCode;
        StaticUserCode ++;
        return number;  

    };

    public void setCart(){
        this. cart = new ShoppingCart();

    }

    // constructor -> called when adding a new user. 
    public User(String userName , String id ,  String password ){

        userCode = setUserCode();
        this.userName = userName;
        this.id = id;
        this.password = password;

    }

    




}
