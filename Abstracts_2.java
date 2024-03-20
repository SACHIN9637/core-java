import java.util.ArrayList;
import java.util.List;

// Abstract class representing a bank account
abstract class BankAccount {
    double balance;

    // Abstract methods for deposit and withdraw
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to view balance
    public double viewBalance() {
        return balance;
    }
}

// Savings account class
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
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
}

// Checking account class
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
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
}

// Customer class containing a list of BankAccount objects
class Customer {
    private List<BankAccount> accounts;

    public Customer() {
        accounts = new ArrayList<>();
    }


    public void addAccount(BankAccount account) {
        accounts.add(account);
    }


    public void displayBalances() {
        System.out.println("Account Balances:");
        for (BankAccount account : accounts) {
            System.out.println("Balance: " + account.viewBalance());
        }
    }


    public void depositMoney(int accountIndex, double amount) {
        BankAccount account = accounts.get(accountIndex);
        account.deposit(amount);
    }


    public void withdrawMoney(int accountIndex, double amount) {
        BankAccount account = accounts.get(accountIndex);
        account.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();


        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);

        customer.addAccount(savingsAccount);
        customer.addAccount(checkingAccount);


        customer.displayBalances();


        customer.depositMoney(0, 200); // Deposit 200 into savings account
        customer.withdrawMoney(1, 100); // Withdraw 100 from checking account


        customer.displayBalances();
    }
}
