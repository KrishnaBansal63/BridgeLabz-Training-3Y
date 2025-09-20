// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass 1
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Electric Vehicle " + model + " is charging.");
    }
}

// Subclass 2
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle " + model + " is refueling.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.charge();
        pv.refuel();
    }
}
