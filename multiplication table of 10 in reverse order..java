
import java.util.Scanner;

class MultiplicationTable
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int n = scanner.nextInt();

        System.out.print("Enter the range up to 10 : ");
        int range = scanner.nextInt();

        scanner.close();

        System.out.println("Multiplication table for " + n + ":");

        for (int i = 1; i >= range; i++)
        {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
