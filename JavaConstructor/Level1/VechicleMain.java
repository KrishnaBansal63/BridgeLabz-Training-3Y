// Class to represent a vehicle
class Vehicle {
    String owner;              // owner name
    String type;               // vehicle type
    static int fee = 1000;     // registration fee (same for all)

    // Constructor
    Vehicle(String o, String t) {
        owner = o;
        type = t;
    }

    // Show vehicle details
    void show() {
        System.out.println("Owner: " + owner + ", Type: " + type + ", Fee: " + fee);
    }

    // Update registration fee
    static void updateFee(int newFee) {
        fee = newFee;
    }
}

// Main class
public class VehicleMain {
    public static void main(String[] args) {
        // create vehicles
        Vehicle v1 = new Vehicle("Aditya", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        // show details
        v1.show();
        v2.show();

        // update registration fee
        Vehicle.updateFee(2000);

        // show again after update
        v1.show();
        v2.show();
    }
}
