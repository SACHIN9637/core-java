import java.util.Scanner;

class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();


        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();


        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Hello, " + name + " " + surname + "!");
        System.out.println("Your marks are: " + marks);
        System.out.println("Your grade is: " + grade);


        scanner.close();
    }
}
