import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;


    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }


    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }


    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }


    public void print() {
        System.out.print(this.real);
        if (this.imaginary >= 0) {
            System.out.print(" + ");
        } else {
            System.out.print(" - ");
        }
        System.out.println(Math.abs(this.imaginary) + "i");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real and imaginary parts of the first complex number: ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex num1 = new Complex(real1, imaginary1);

        System.out.print("Enter the real and imaginary parts of the second complex number: ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex num2 = new Complex(real2, imaginary2);

        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);

        System.out.println("The sum of the two complex numbers is:");
        sum.print();

        System.out.println("The difference of the two complex numbers is:");
        difference.print();

        System.out.println("The product of the two complex numbers is:");
        product.print();
    }
}
