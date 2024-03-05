package _14CompositionAndStatic;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = " ";
        product.price = 10;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
