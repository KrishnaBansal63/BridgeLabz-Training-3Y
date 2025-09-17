// Abstract Vehicle class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation: getters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

// Interface - Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 2000; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 2000 per rental";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 500 per rental";
    }
}

// Truck class
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }
}

// Main
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", 1000);
        Vehicle v2 = new Bike("B202", 300);
        Vehicle v3 = new Truck("T303", 2000);

        // Polymorphism: different rental costs
        System.out.println("Car Rent: " + v1.calculateRentalCost(5));
        System.out.println("Bike Rent: " + v2.calculateRentalCost(3));
        System.out.println("Truck Rent: " + v3.calculateRentalCost(2));

        if (v1 instanceof Insurable) {
            System.out.println(((Insurable) v1).getInsuranceDetails());
        }
    }
}
