package logic.functions;


public class Order {

    public Product prod;
    public String quantity;
    public  String size;
    

    // Constructor called when the user clicks the add to shopping cart button / or buy now button
    public  Order(Product prod, String quantity, String size) {

        this.prod = prod;
        this.quantity = quantity;
        this.size = size;

    }
    


}
