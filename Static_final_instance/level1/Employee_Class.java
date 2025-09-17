class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id;       // final → cannot be changed once assigned
    private String designation;

    // Constructor using 'this' keyword
    public Employee(String name, int id, String designation) {
        this.name = name;            // using 'this' to resolve ambiguity
        this.id = id;
        this.designation = designation;
        totalEmployees++;            // increment total employees when new object created
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
        System.out.println("---------------------------------");
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {  // using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid Employee instance!");
        }
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating employees
        Employee emp1 = new Employee("Krishna Bansal", 101, "Software Engineer");
        Employee emp2 = new Employee("Priya Bansal", 102, "Data Scientist");

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees (static method)
        Employee.displayTotalEmployees();

        // instanceof usage
        if (emp1 instanceof Employee) {
            System.out.println("emp1 is a valid Employee object.");
        }
    }
}
