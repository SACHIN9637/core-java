// Parent class Employee
class Employee {
    public double calculateSalary() {
        // Default implementation for calculating salary
        return 0;
    }
}

// Subclass Manager
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary for Manager (base salary + bonus)
        return baseSalary + bonus;
    }
}

// Subclass Programmer
class Programmer extends Employee {
    private double baseSalary;
    private int bonusHours;
    private double hourlyRate;

    public Programmer(double baseSalary, int bonusHours, double hourlyRate) {
        this.baseSalary = baseSalary;
        this.bonusHours = bonusHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary for Programmer (base salary + bonus based on extra hours worked)
        return baseSalary + (bonusHours * hourlyRate);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Manager and Programmer classes
        Manager manager = new Manager(5000, 1000);
        Programmer programmer = new Programmer(3000, 10, 20);

        // Calculate and display salaries
        System.out.println("Manager's Salary: " + manager.calculateSalary());
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}
