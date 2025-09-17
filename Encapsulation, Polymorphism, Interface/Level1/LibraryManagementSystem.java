// Abstract class for Library Items
abstract class LibraryItem {
    private int itemId;     // Encapsulation
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    // Abstract method
    public abstract int getLoanDuration();
}

// Interface for Reservable
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully!");
        } else {
            System.out.println("Book not available!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine
class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }
}

// DVD
class DVD extends LibraryItem {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }
}

// Main
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem b1 = new Book(1, "Java Basics", "James");
        LibraryItem m1 = new Magazine(2, "Tech World", "Editor");
        LibraryItem d1 = new DVD(3, "Movie DVD", "Director");

        b1.getItemDetails();
        System.out.println("Loan Duration: " + b1.getLoanDuration());

        ((Book)b1).reserveItem();

        m1.getItemDetails();
        System.out.println("Loan Duration: " + m1.getLoanDuration());

        d1.getItemDetails();
        System.out.println("Loan Duration: " + d1.getLoanDuration());
    }
}
