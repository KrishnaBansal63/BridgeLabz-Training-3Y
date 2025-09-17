// Abstract class for Bank Accounts (Abstraction)
abstract class BankAccount {
    private int accountNumber;   // Encapsulation
    private String holderName;   // Encapsulation
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters (Encapsulation)
    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// Interface for Loan feature
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account (Subclass)
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;  // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied in Savings Account for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

// Current Account (Subclass)
class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;  // 2% interest
    }
}

// Main
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "John", 10000);
        BankAccount acc2 = new CurrentAccount(102, "Alice", 20000);

        // Polymorphism: Using BankAccount reference
        System.out.println("Savings Interest: " + acc1.calculateInterest());
        System.out.println("Current Interest: " + acc2.calculateInterest());

        if (acc1 instanceof Loanable) {
            Loanable l = (Loanable) acc1;
            l.applyForLoan(50000);
            System.out.println("Eligible: " + l.calculateLoanEligibility());
        }
    }
}
