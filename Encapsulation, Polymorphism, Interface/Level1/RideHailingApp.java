// Abstract Vehicle
abstract class RideVehicle {
    private String vehicleId;   // Encapsulation
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm);
    }

    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);
}

// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car
class CarRide extends RideVehicle implements GPS {
    private String location;

    public CarRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

// Bike
class BikeRide extends RideVehicle {
    public BikeRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

// Auto
class AutoRide extends RideVehicle {
    public AutoRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // base charge
    }
}

// Main
public class RideHailingApp {
    public static void main(String[] args) {
        RideVehicle v1 = new CarRide("C101", "John", 15);
        RideVehicle v2 = new BikeRide("B202", "Sam", 8);
        RideVehicle v3 = new AutoRide("A303", "Ravi", 10);

        v1.getVehicleDetails();
        System.out.println("Fare: " + v1.calculateFare(10));

        v2.getVehicleDetails();
        System.out.println("Fare: " + v2.calculateFare(10));

        v3.getVehicleDetails();
        System.out.println("Fare: " + v3.calculateFare(10));
    }
}
