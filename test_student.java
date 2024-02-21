/*create a java program with two classes student and test student
student class has 3 prop namely id, first name, last name
student class has constructor and printStudent method
Constructor accepts all 3 prop and set them to object prop id, first name, last name
print student method returns a string representation of the invoking student object
with format ID : 30  First Name: sachin   Last Name: jadhav

the test_student class has main method that first prints program title and prompts user to enter
name of n student,
creates an array with name,
 prompts user to enter records for all students from standard input to the elements of student array
and call the print student method to print the format */



import java.util.Scanner;

class Student
{
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String printStudent()
    {
        return "ID: " + id + "  First Name: " + firstName + "  Last Name: " + lastName;
    }
}

class TestStudent
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Student Information Program");


        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();


        Student[] students = new Student[n];


        for (int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details for Student " + (i + 1));


            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();


            students[i] = new Student(id, firstName, lastName);
        }


        System.out.println("\nStudent Information:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(students[i].printStudent());
        }

    }


}

