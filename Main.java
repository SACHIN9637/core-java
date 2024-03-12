import java.util.Scanner;

class Bank {
    int Acc_no;
    int Balance;
    String Phone_no;
    String name;
    String mail;


    public Bank() {

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

    void Deposite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Deposit: ");
        int Depo = sc.nextInt();
        Balance += Depo;
        System.out.println("Updated Balance: " + Balance);
    }

    void Withdraw() {
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

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bank b1 = new Bank();

        b1.getInfo();
        System.out.print("\n");
        b1.showInfo();
        System.out.print("\n");
        b1.Deposite();
        System.out.print("\n");
        b1.Withdraw();
        System.out.print("\n");
        b1.showInfo();
    }
}
