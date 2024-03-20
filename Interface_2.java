// Interface for generic account operations
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// Savings account class
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

// Current account class
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts typically do not earn interest
        return 0;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 200);

        // Perform transactions
        savingsAccount.deposit(500);
        currentAccount.withdraw(300);

        // Display balances
        System.out.println("Savings Account Balance: " + savingsAccount.viewBalance());
        System.out.println("Current Account Balance: " + currentAccount.viewBalance());
    }
}
