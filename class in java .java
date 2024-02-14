import java.util.Scanner;

class Student
{

    int rollNo;
    String name;
    String branch;
    float cgpa;

    void getInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll_No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Branch: ");
        branch = sc.nextLine();
        System.out.println("Enter CGPA: ");
        cgpa = sc.nextFloat();
    }


    void showInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("For Student " + (i + 1));
            s[i] = new Student();
            s[i].getInfo();
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println("Details for Student " + (i + 1));
            s[i].showInfo();
        }
    }
}
