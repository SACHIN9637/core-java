import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Constructor to initialize complex numbers
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex c) {
        double realSum = this.real + c.real;
        double imaginarySum = this.imaginary + c.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex c) {
        double realDiff = this.real - c.real;
        double imaginaryDiff = this.imaginary - c.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex c) {
        double realProduct = (this.real * c.real) - (this.imaginary * c.imaginary);
        double imaginaryProduct = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to display the complex number
    public void display() {
        System.out.println("Result: " + real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first complex number
        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();

        // Input for second complex number
        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();

        // Create objects for two complex numbers
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // Perform operations and display results
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum:");
        sum.display();

        System.out.println("Difference:");
        difference.display();

        System.out.println("Product:");
        product.display();

        scanner.close();
    }
}
