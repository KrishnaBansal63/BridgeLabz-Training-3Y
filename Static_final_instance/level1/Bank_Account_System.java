class BankAccount {
    // Static variable shared by all accounts
    static String bankName = "ABC National Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final int accountNumber; // final: cannot be changed after initialization
    private double balance;
  
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber; 
        this.balance = balance;
        totalAccounts++; // every new account increases count
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    //display account details
    public void displayDetails() {
        if (this instanceof BankAccount) { // using instanceof
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Not a valid BankAccount instance!");
        }
    }
}

// Main class
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating accounts
        BankAccount acc1 = new BankAccount("Krishna Bansal", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Priya Bansal", 1002, 10000.0);

        // Display details
        acc1.displayDetails();
        acc2.displayDetails();

        // Static method call
        BankAccount.getTotalAccounts();

        
        if (acc1 instanceof BankAccount) {
            System.out.println("acc1 is a valid BankAccount object.");
        }
    }
}
