package oops.constructor;

public class Product {
    int productId;
    String productName;

    //to different between local variable and instance variable we use this keyword to access instance variables
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Product() {
    }


}
