// Abstract Patient class
abstract class Patient {
    private int patientId;   // Encapsulation
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

// Interface for MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int days;
    private String record;

    public InPatient(int patientId, String name, int age, double dailyCharge, int days) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.days = days;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * days;
    }

    @Override
    public void addRecord(String record) {
        this.record = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + record);
    }
}

// OutPatient
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "John", 45, 2000, 5);
        Patient p2 = new OutPatient(2, "Alice", 30, 500);

        p1.getPatientDetails();
        System.out.println("Bill: " + p1.calculateBill());
        ((InPatient)p1).addRecord("Admitted for surgery");
        ((InPatient)p1).viewRecords();

        p2.getPatientDetails();
        System.out.println("Bill: " + p2.calculateBill());
    }
}
