// Class to represent a product
class Product {
    String name;           // product name
    double price;          // product price
    static int count = 0;  // shared variable to count total products

    // Constructor to initialize product details
    Product(String n, double p) {
        name = n;
        price = p;
        count++;           // increase count when product created
    }

    // Instance method to display product details
    void show() {
        System.out.println("Name: " + name + ", Price: " + price);
    }

    // Class method to display total products
    static void showCount() {
        System.out.println("Total Products: " + count);
    }
}

// Main class
public class ProductInventory {
    public static void main(String[] args) {
        // create two products
        Product a = new Product("Pen", 10);
        Product b = new Product("Book", 50);

        // show product details
        a.show();
        b.show();

        // show total count
        Product.showCount();
    }
}
