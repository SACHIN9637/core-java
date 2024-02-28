/*1.Write a program to Find sum of square of first 100 numbers*/

/*
class SumOfSquares {
    public static void main(String[] args) {

        int n = 100;


        int result = sumOfSquares(n);


        System.out.println("The sum of squares of the first " + n + " numbers is: " + result);
    }


    private static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
*/


/* 2.Write  program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100. Also computer their absolute difference.*/

/*
import java.util.Scanner;

class SumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        int sumOfOdds = 0;
        int sumOfEvens = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            } else {
                sumOfOdds += i;
            }
        }

        int absoluteDifference = Math.abs(sumOfOdds - sumOfEvens);

        System.out.println("Sum of odd numbers: " + sumOfOdds);
        System.out.println("Sum of even numbers: " + sumOfEvens);
        System.out.println("Absolute difference: " + absoluteDifference);

        // Close the scanner
        scanner.close();
    }
}
 */

/* 3.Write a program called  Harmonic sum of  a harmonic series. Harmonic series is
Harmonic(n)=1+1/2+1/3+...........+1/n */

/*
import java.util.Scanner;

class HarmonicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of 'n' for the harmonic series: ");
        int n = scanner.nextInt();


        double harmonicSum = calculateHarmonicSum(n);


        System.out.println("Harmonic Sum for n = " + n + ": " + harmonicSum);


        scanner.close();
    }


    private static double calculateHarmonicSum(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}


 */


/* 4. Write a Java program to calculate the average value of array elements.*/

/*
import java.util.Scanner;

class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        double[] array = new double[size];


        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }


        double average = calculateAverage(array);


        System.out.println("Average value of array elements: " + average);


        scanner.close();
    }


    private static double calculateAverage(double[] array) {
        double sum = 0.0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }
}
*/

/* 5.Write a Java program to remove a specific element from an array. */

/*
import java.util.Scanner;

class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] array = new int[size];


        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        System.out.print("Enter the element to be removed: ");
        int elementToRemove = scanner.nextInt();


        removeElementFromArray(array, elementToRemove);


        System.out.println("Array after removing element " + elementToRemove + ":");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");
        }


        scanner.close();
    }


    private static void removeElementFromArray(int[] array, int elementToRemove) {
        int newSize = array.length - 1;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                array[index++] = array[i];
            }
        }


        array[array.length - 1] = 0;
    }
}

 */

/* 6.Write a Java method(function) to compute the future investment value at a given interest rate for a specified number of years. */

/*
import java.util.Scanner;

class FutureInvestmentValueInRupees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount in Rupees: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(principal, annualInterestRate, years);

        System.out.println("Future Investment Value: ₹" + futureValue);

        scanner.close();
    }

    private static double calculateFutureValue(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double futureValue = principal * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}
 */

/* 7. Write a java program to compute any 10 string operations.(all students string operation should be differnt) */

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();


        System.out.println("1. Concatenation: " + str1.concat(str2));
        System.out.println("2. Length of the first string: " + str1.length());


        if (str2.length() > 2) {
            System.out.println("3. Character at index 2 in the second string: " + str2.charAt(2));
        } else {
            System.out.println("3. Unable to get character at index 2 in the second string.");
        }
        if (str1.length() >= 8) {
            System.out.println("4. Substring from index 3 to 7 in the first string: " + str1.substring(3, 8));
        } else {
            System.out.println("4. Unable to get substring from index 3 to 7 in the first string.");
        }

        System.out.println("5. Index of the first occurrence of 'e' in the second string: " + str2.indexOf('e'));
        System.out.println("6. Uppercase of the first string: " + str1.toUpperCase());
        System.out.println("7. Lowercase of the second string: " + str2.toLowerCase());
        System.out.println("8. Replace 'o' with 'X' in the first string: " + str1.replace('o', 'X'));
        System.out.println("9. Check if the first string starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("10. Check if the second string ends with 'World': " + str2.endsWith("World"));


    }
}
