// Parent class
class Employee {
    public int employeeID;        // Public
    protected String department;  // Protected
    private double salary;        // Private

    // Constructor
    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double sal) {
        salary = sal;
    }
}

// Subclass
class Manager extends Employee {
    String role;

    Manager(int id, String dept, double sal, String r) {
        super(id, dept, sal);
        role = r;
    }

    // Show details using public + protected
    void showDetails() {
        System.out.println("Employee ID: " + employeeID);   // public
        System.out.println("Department: " + department);    // protected
        System.out.println("Salary: " + getSalary());       // private via getter
        System.out.println("Role: " + role);
    }
}

// Main class
public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 45000, "Project Manager");

        m.showDetails();

        // Modify salary using public method
        m.setSalary(50000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
