class Product {
    // Static variable shared by all products
    static double discount = 10.0;  // in percentage, same for all products

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID;  // final → cannot be changed once assigned

    // Constructor using 'this'
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;   // unique identifier
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
        System.out.println("---------------------------------");
    }

    // Method to calculate total price with discount
    public double calculateTotalPrice() {
        double total = price * quantity;
        double discountedPrice = total - (total * discount / 100);
        return discountedPrice;
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {   // using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: ₹" + calculateTotalPrice());
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid Product instance!");
        }
    }
}

// Main class
public class ShoppingCart {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product(1, "Laptop", 50000.0, 1);
        Product p2 = new Product(2, "Headphones", 2000.0, 2);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Update discount (static method applies to all products)
        Product.updateDiscount(20.0);

        // Display details again after discount update
        p1.displayProductDetails();
        p2.displayProductDetails();

        // instanceof usage
        if (p1 instanceof Product) {
            System.out.println("p1 is a valid Product object.");
        }
    }
}
