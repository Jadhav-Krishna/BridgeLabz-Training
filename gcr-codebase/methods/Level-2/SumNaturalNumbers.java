import java.util.*;

public class SumNaturalNumbers {
    // Taking input from user and displaying sum of first n natural numbers using recursion and formula
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        if(number > 0){
            if(recursionSumNatural(number) == sumNatural(number)){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else {
            System.out.println("not a natural number");
        }
    }
    // calculate sum of first n natural numbers using recursion
    public static int recursionSumNatural(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + recursionSumNatural(n - 1);
    }
    // calculate sum of first n natural numbers using formula
    public static int sumNatural(int n){
        return n*(n+1)/2;
    }
}
