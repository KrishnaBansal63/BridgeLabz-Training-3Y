// Book class
class Book {
    public String ISBN;       // Public
    protected String title;   // Protected 
    private String author;    // Private 

    // Constructor
    Book(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

    // Setter for private author
    public void setAuthor(String a) {
        author = a;
    }
}

// EBook is a subclass of Book
class EBook extends Book {
    String format; 

    // Constructor
    EBook(String i, String t, String a, String f) {
        super(i, t, a); 
        format = f;
    }

    // Method to show ebook details
    void show() {
        System.out.println("ISBN: " + ISBN);       // Access public
        System.out.println("Title: " + title);     // Access protected
        System.out.println("Format: " + format);   // Own variable
        System.out.println("Author: " + getAuthor()); 
    }
}

// Main class
public class LibraryMain {
    public static void main(String[] args) {
        // Create EBook object
        EBook e = new EBook("111-XYZ", "Java Basics", "Aditya", "PDF");
        e.show();

        e.setAuthor("Rahul");
        System.out.println("Updated Author: " + e.getAuthor());
    }
}
