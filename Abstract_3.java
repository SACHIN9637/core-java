abstract class Account {
    // Abstract method for calculating interest
    public abstract double calculateInterest();
}

// Savings account class
class SavingsAccount extends Account {
    double balance;
    double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

// Current account class
class CurrentAccount extends Account {
    double balance;
    // No interest is calculated for a current account

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically do not earn interest
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of both classes and test their behavior
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500);

        // Display interest earned by savings account
        System.out.println("Interest earned by Savings Account: " + savingsAccount.calculateInterest());

        // Display interest earned by current account (should be 0)
        System.out.println("Interest earned by Current Account: " + currentAccount.calculateInterest());
    }
}
