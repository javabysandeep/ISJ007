package oops.constructor;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product(1, "Mobile");
        System.out.println(product.productId + "\t" + product.productName);
    }
}
