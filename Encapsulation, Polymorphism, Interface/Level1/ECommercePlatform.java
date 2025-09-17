// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters (Encapsulation)
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Abstract method
    public abstract double calculateDiscount();
}

// Interface - Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;  // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;  // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main
public class ECommercePlatform {
    // Polymorphism: method can handle any product type
    public static void printFinalPrice(Product p) {
        double discount = p.calculateDiscount();
        double tax = 0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }

        double finalPrice = p.getPrice() + tax - discount;
        System.out.println(p.getName() + " Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product e = new Electronics(1, "Laptop", 50000);
        Product c = new Clothing(2, "Shirt", 2000);
        Product g = new Groceries(3, "Rice Bag", 1000);

        printFinalPrice(e);
        printFinalPrice(c);
        printFinalPrice(g);
    }
}
