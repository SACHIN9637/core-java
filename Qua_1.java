
/*  1. Write a Java program that reads a floating-point number and prints "zero"
    if the number is zero. Otherwise, print "positive" or "negative". Add "small"
    if the absolute value of the number is less than 1, or "large" if it exceeds
    1,000,000.*/

import java.util.Scanner;

 class NumberClassifier
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");

        double number = scanner.nextDouble();

        scanner.close();


        if (number == 0)
        {
            System.out.println("zero");
        } else
        {

            String sign = (number > 0) ? "positive" : "negative";


            String magnitude = (Math.abs(number) < 1) ? "small" : (Math.abs(number) > 1000000) ? "large" : "";


            System.out.println(sign + " " + magnitude);
        }
    }
}
