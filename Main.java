import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter elements for matrix m1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter elements for matrix m2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = sc.nextInt();
            }
        }


        int[][] m3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }


        System.out.println("Resultant matrix m3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
