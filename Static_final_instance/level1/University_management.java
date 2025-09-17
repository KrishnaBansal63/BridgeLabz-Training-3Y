class Student {
    // Static variable shared by all students
    static String universityName = "National Institute of Technology";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber;   // final → cannot be changed
    private String grade;

    // Constructor using 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;               // 'this' resolves ambiguity
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;                // increment when new student created
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
        System.out.println("---------------------------------");
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {   // using instanceof
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Invalid Student object. Cannot update grade!");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {   // using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid Student instance!");
        }
    }
}

// Main class
public class StudentManagement {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Krishna Bansal", 101, "A");
        Student s2 = new Student("Priya Bansal", 102, "B+");

        // Display student details
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        // Update grade
        s2.updateGrade("A");

        // Display again after update
        s2.displayStudentDetails();

        // Show total students
        Student.displayTotalStudents();

        // instanceof check
        if (s1 instanceof Student) {
            System.out.println("s1 is a valid Student object.");
        }
    }
}
