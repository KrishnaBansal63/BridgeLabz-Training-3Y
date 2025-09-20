// Superclass
class Book {
    String title;
    int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title + ", Published: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call Book’s displayInfo
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

// Main class
public class LibraryDemo {
    public static void main(String[] args) {
        Author a1 = new Author("Java Programming", 2022, "James Gosling", "Father of Java");
        a1.displayInfo();
    }
}
