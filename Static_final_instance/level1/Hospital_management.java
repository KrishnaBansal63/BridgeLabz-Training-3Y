class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID;   // final → cannot be changed after assignment

    // Constructor using 'this' keyword
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;   // unique ID
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;              // count patients
    }

    // Static method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients admitted in " + hospitalName + ": " + totalPatients);
        System.out.println("---------------------------------");
    }

    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) {   // using instanceof
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid Patient instance!");
        }
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        // Create patients
        Patient p1 = new Patient(1, "Krishna Bansal", 22, "Fever");
        Patient p2 = new Patient(2, "Priya Bansal", 20, "Fracture");

        // Display patient details
        p1.displayDetails();
        p2.displayDetails();

        // Show total patients
        Patient.getTotalPatients();

        // instanceof check
        if (p1 instanceof Patient) {
            System.out.println("p1 is a valid Patient object.");
        }
    }
}
