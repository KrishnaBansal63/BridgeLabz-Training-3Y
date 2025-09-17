// Abstraction: Employee is abstract
abstract class Employee {
    private int employeeId;   // encapsulation
    private String name;      // encapsulation
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters (Encapsulation)
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Abstract method - must be implemented in subclasses
    public abstract double calculateSalary();

    // Normal method
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Subclass - Full time employee
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();  // fixed salary
    }
}

// Subclass - Part time employee
class PartTimeEmployee extends Employee {
    private int workHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return workHours * 100;  // hourly wage
    }
}

// Interface for department
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Implementation of Department
class DepartmentEmployee extends FullTimeEmployee implements Department {
    private String department;

    public DepartmentEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphism: Employee reference can hold different objects
        Employee e1 = new FullTimeEmployee(101, "John", 30000);
        Employee e2 = new PartTimeEmployee(102, "Sam", 0, 40);

        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());

        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());

        DepartmentEmployee d1 = new DepartmentEmployee(103, "Alice", 40000);
        d1.assignDepartment("HR");
        d1.displayDetails();
        System.out.println(d1.getDepartmentDetails());
    }
}
