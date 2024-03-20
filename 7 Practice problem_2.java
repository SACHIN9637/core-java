class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    // Constructor to initialize employee details
    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.printf("%-10s%-20d%-30s\n", name, yearOfJoining, address);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Employee class for three employees
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

        // Print the header
        System.out.printf("%-10s%-20s%-30s\n", "Name", "Year of joining", "Address");

        // Display information for each employee
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
