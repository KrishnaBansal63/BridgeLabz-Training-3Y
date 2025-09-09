// Class to represent a course
class Course {
    String name;               // course name
    int duration;              // duration in months
    double fee;                // course fee
    static String instName = "ABC Institute"; // same for all courses

    // Constructor
    Course(String n, int d, double f) {
        name = n;
        duration = d;
        fee = f;
    }

    // Show course details
    void show() {
        System.out.println("Course: " + name + ", Duration: " + duration + 
                           " months, Fee: " + fee + ", Institute: " + instName);
    }

    // Update institute name
    static void updateInst(String newName) {
        instName = newName;
    }
}

// Main class
public class CourseMain {
    public static void main(String[] args) {
        // create courses
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);

        // show course details
        c1.show();
        c2.show();

        // change institute name
        Course.updateInst("XYZ Academy");

        // show again after update
        c1.show();
        c2.show();
    }
}
