import java.util.Scanner;

class Bank {
    int Acc_no;
    int Balance;
    String Phone_no;
    String name;
    String mail;

    public Bank() {
        name = "sachin";
        mail = "sachin.jadhav@mitaoe.ac.in";
        Phone_no = "1234567890";
        Acc_no = 1;
        Balance = 1000;
    }

    public Bank(int acc_no, int balance, String name) {
        this.Acc_no = acc_no;
        this.Balance = balance;
        this.name = name;
    }

    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter mail: ");
        mail = sc.next();
        System.out.println("Enter Phone No: ");
        Phone_no = sc.next();

        sc.nextLine();

        System.out.println("Enter Account No: ");
        Acc_no = sc.nextInt();
        System.out.println("Enter Balance: ");
        Balance = sc.nextInt();
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
        System.out.println("Phone No: " + Phone_no);
        System.out.println("Acc_no: " + Acc_no);
        System.out.println("Balance: " + Balance);
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Deposit: ");
        int depo = sc.nextInt();
        Balance += depo;
        System.out.println("Updated Balance: " + Balance);
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        int with = sc.nextInt();
        if (with > Balance)
            System.out.println("Cannot Withdraw..!");
        else
            Balance -= with;
        System.out.println("Updated Balance: " + Balance);
    }
}

class SavingAccount extends Bank {
    int limit;

    SavingAccount(int acc_no, int balance, String name) {
        super(acc_no, balance, name);
        limit = 1000;
    }


    void showInfo_2() {
        System.out.println("Name: " + name);
        System.out.println("Mail: " + mail);
        System.out.println("Phone No: " + Phone_no);
        System.out.println("Acc_no: " + Acc_no);
        System.out.println("Balance: " + Balance);
        System.out.println("limit: " + limit);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bank b1 = new Bank();

        System.out.println("\nDefault Information:");
        b1.showInfo();

        b1.getInfo();
        System.out.println("\nInformation after setting values:");
        b1.showInfo();

        b1.deposit();
        System.out.println("\nInformation after deposit:");
        b1.showInfo();

        b1.withdraw();
        System.out.println("\nInformation after withdrawal:");
        b1.showInfo();

        SavingAccount savingAccount = new SavingAccount(123, 1000, "John Doe");

        System.out.println("\nSaving Account Information:");
        savingAccount.showInfo_2();
    }
}
