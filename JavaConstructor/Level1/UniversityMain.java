class Student {
    public int roll;        // public 
    protected String name;  // protected 
    private double cgpa;    // private 

    // Constructor
    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }

    // Getter for cgpa
    public double getCgpa() {
        return cgpa;
    }

    // Setter for cgpa
    public void setCgpa(double c) {
        cgpa = c;
    }
}
class PostgraduateStudent extends Student {
    String spec; // specialization

    PostgraduateStudent(int r, String n, double c, String s) {
        super(r, n, c); // call parent constructor
        spec = s;
    }

    // Show PG details
    void showPG() {
        
        System.out.println("Name: " + name + ", Specialization: " + spec);
    }
}

// Main class
public class UniversityMain {
    public static void main(String[] args) {
        // create student
        Student s = new Student(1, "Aditya", 8.5);
        System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", CGPA: " + s.getCgpa());

        // update cgpa using setter
        s.setCgpa(9.0);
        System.out.println("Updated CGPA: " + s.getCgpa());

        // create PG student
        PostgraduateStudent pg = new PostgraduateStudent(2, "Rahul", 9.2, "AI");
        pg.showPG();
    }
}
