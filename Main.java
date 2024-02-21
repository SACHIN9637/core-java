//write a program which has base class vehicle which consists of data member name, color, year and model
// and this vehicle class has constructor which takes input and assigns to the data members of class.
//Then we have subclass car and motocycle, car have data member bodystyle and motorcycle has data member companytype
// call constructor of base class in both these classes




import java.util.Scanner;

class Vehicle {
    String name;
    String color;
    int year;
    String model;

    Scanner sc = new Scanner(System.in);

    Vehicle() {
        System.out.println("Enter Name of Vehicle: ");
        name = sc.nextLine();
        System.out.println("Enter Model of Vehicle: ");
        model = sc.nextLine();
        System.out.println("Enter Year of Manufacture: ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Color of Vehicle: ");
        color = sc.nextLine();
    }
}

class Car extends Vehicle {
    String Body;
    Scanner sc = new Scanner(System.in);

    Car() {
        super();
        System.out.println("Enter Body Type (SUV, Sedan, Hatchback, Coupe): ");
        Body = sc.nextLine();
    }

    void Showdata() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Year: " + year);
        System.out.println("Model : " + model);
        System.out.println("Body Style : " + Body);
    }
}

class MotorCycle extends Vehicle {
    String company;
    Scanner sc = new Scanner(System.in);

    MotorCycle() {
        super();
        System.out.println("Enter Company: ");
        company = sc.nextLine();
    }

    void Showdata() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Year: " + year);
        System.out.println("Model : " + model);
        System.out.println("Company : " + company);
    }
}

class Inheritance3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car c1 = new Car();
        c1.Showdata();

        MotorCycle m1 = new MotorCycle();
        m1.Showdata();
    }
}
