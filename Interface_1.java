import java.util.Scanner;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape (1 for Circle, 2 for Rectangle): ");
        int choice = sc.nextInt();
        double area = 0;

        if (choice == 1) {
            System.out.println("Enter Radius: ");
            int radius = sc.nextInt();
            Circle c1 = new Circle(radius);
            area = c1.getArea();
        } else if (choice == 2) {
            System.out.println("Enter Length: ");
            int length = sc.nextInt();
            System.out.println("Enter Width: ");
            int width = sc.nextInt();
            Rectangle r1 = new Rectangle(length, width);
            area = r1.getArea();
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Area: " + area);
    }
}
