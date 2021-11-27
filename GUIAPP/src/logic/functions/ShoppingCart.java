package logic.functions;

import java.util.ArrayList;

public class ShoppingCart {

    // a set of Orders. 
    // Orders are Stored inside of the arrayList
    // Each Order is consist of arrayList and a Order Code. 
    public ArrayList<Order> orderList= new ArrayList<Order>();
    public int cartCode ;

    // adding product inside of the Order ArrayList
    public void addProduct(Order order){

            orderList.add(order);
            
            // for debugging -> check the added Order
            System.out.println(orderList);

    }
    
    //constructor
    public ShoppingCart{





    }
    
}
