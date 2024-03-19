import java.util.Scanner;

abstract class Employee {
    String name;
    int salary;
    int age;
    int workexp;

    Scanner sc = new Scanner(System.in);

    void getDetail() {
        System.out.println("Enter Name of Employee: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Work Exp: ");
        workexp = sc.nextInt();
    }

    abstract void calculateSalary();

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Exp: " + workexp);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Certifications: ");
        int cert = sc.nextInt();
        salary = workexp * 10000 + cert * 5000;
        System.out.println("Your Expected Salary: " + salary);
    }
}

class Worker extends Employee {
    void calculateSalary() {
        salary = workexp * 8000;
    }
}

class SalesPerson extends Manager {
    void calculateSalary() {
        salary = workexp * 10000 + 20000;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Manager manager = new Manager();
        System.out.println("Details for Manager:");
        manager.getDetail();
        manager.calculateSalary();
        manager.displayEmployeeDetails();

        Worker worker = new Worker();
        System.out.println("\nDetails for Worker:");
        worker.getDetail();
        worker.calculateSalary();
        worker.displayEmployeeDetails();

//        SalesPerson salesPerson = new SalesPerson();
//        System.out.println("\nDetails for SalesPerson:");
//        salesPerson.getDetail();
//        salesPerson.calculateSalary();
//        salesPerson.displayEmployeeDetails();
    }
}


