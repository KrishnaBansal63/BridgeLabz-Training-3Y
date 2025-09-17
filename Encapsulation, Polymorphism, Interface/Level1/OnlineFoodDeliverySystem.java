// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;   // Encapsulation
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Interface for Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount 10%";
    }
}

// NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra 50 charge
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount 5%";
    }
}

// Main
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem v = new VegItem("Paneer", 200, 2);
        FoodItem nv = new NonVegItem("Chicken", 300, 1);

        v.getItemDetails();
        System.out.println("Total Price: " + v.calculateTotalPrice());

        nv.getItemDetails();
        System.out.println("Total Price: " + nv.calculateTotalPrice());

        if (v instanceof Discountable) {
            System.out.println(((Discountable) v).getDiscountDetails());
        }
    }
}
