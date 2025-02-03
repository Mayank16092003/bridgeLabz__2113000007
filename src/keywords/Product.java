package keywords;
public class Product {
    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void displayProductDetails() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: in rupee" + price);
        System.out.println("Discounted Price: in rupee" + discountedPrice);
        System.out.println("Quantity: " + quantity);
    }
    public static void main(String[] args) {
        Product.updateDiscount(10.0); // Set discount to 10%
        Product product1 = new Product("P001", "Laptop", 1000.00, 5);
        Product product2 = new Product("P002", "Smartphone", 500.00, 10);
        if (product1 instanceof Product) {
            product1.displayProductDetails();
        }
        if (product2 instanceof Product) {
            product2.displayProductDetails();
        }
    }
}