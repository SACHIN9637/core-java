import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Fibonacci Using Loops: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many fib. digits you want: ");
        int n  = sc.nextInt();

        int fib_next = 0;
        int fib_prev = 0;
        int fib_curr = 1;
        for(int i=1; i<n; i++) {
            System.out.println(fib_curr);
            fib_next = fib_curr + fib_prev;
            fib_prev = fib_curr;
            fib_curr = fib_next;

        }

    }
}

