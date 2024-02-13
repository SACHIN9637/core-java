import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();


        printStarPattern(numRows);


        scanner.close();
    }

    private static void printStarPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
