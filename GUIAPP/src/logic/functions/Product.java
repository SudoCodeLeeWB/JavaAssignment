// the product should include these informations


package logic.functions;

public class Product {
    
public String productName , keyword1 =""  , keyword2 ="" , keyword3= "" ;
public int productPrice;
public String imagePath="lib/productImgs" , imageName;


// adding the image?
    public  Product(String productName , String keyword1 , String keyword2 , String keyword3 , int  productPrice , String imageName ){

        this. productName = productName;
        this. keyword1 = keyword1;
        this. keyword2 = keyword2;
        this. keyword3 = keyword3;
        this. productPrice = productPrice;  
        this.imageName = imageName;
    }


    




}
