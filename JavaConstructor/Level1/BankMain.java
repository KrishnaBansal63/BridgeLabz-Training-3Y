// Parent class
class BankAccount {
    public int accountNumber;        // Public
    protected String accountHolder;  // Protected
    private double balance;          // Private

    // Constructor
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    // Getter for private balance
    public double getBalance() {
        return balance;
    }

    // Setter for private balance (deposit/withdraw)
    public void setBalance(double bal) {
        balance = bal;
    }
}

// Subclass demonstrating access
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal);
        interestRate = rate;
    }

    // Show details using public + protected members
    void showDetails() {
        System.out.println("Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);   // protected
        System.out.println("Balance: " + getBalance());           // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Aditya", 5000, 4.5);

        sa.showDetails();

        // Modify private balance via public method
        sa.setBalance(6000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
