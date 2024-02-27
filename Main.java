/*2. Write a Java program that takes three numbers from the user and prints
the greatest number.*/



import java.util.Scanner;

class GreatestNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        double greatestNumber = Math.max(Math.max(num1, num2), num3);

        System.out.println("The greatest number is: " + greatestNumber);
    }
}
