class Book {
    // Static variable shared by all books
    static String libraryName = "City Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn;  // final → cannot be changed once assigned

    // using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;   // this resolves ambiguity
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("---------------------------------");
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {  // using instanceof
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid Book instance!");
        }
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name using static method
        Book.displayLibraryName();

        // Create some books
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam", "9788173711466");

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // instanceof demo
        if (book1 instanceof Book) {
            System.out.println("book1 is a valid Book object.");
        }
    }
}
