package logic.functions;


public class Order {

    public Product prod;
    public int quantity;
    public  char size;
    

// Constructor called when the user clicks the add to shopping cart button / or buy now button
public  Order(Product prod, int quantity, char size) {
    
    this.prod = prod;
    this.quantity = quantity;
    this.size = size;

}
