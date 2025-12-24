import java.util.*;
// Fibonacci sequence up to a specified number of terms entered by the user.

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int terms = sc.nextInt();
        System.out.println("sequence " + terms );
        printFibonacciSequence(terms);
        sc.close();
    }
    public static void printFibonacciSequence(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
