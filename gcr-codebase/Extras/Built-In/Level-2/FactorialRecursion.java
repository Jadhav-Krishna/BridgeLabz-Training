import java.util.*;
// calculates the factorial of a number using a recursive function.
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("factorial: " + factorial);
        sc.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
