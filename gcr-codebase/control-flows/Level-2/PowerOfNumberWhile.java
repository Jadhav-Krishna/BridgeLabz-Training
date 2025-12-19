import java.util.*;

// Rewrite the above program to find the power of a number using a while loop.
// taking input from the user
public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int number = sc.nextInt();
        System.out.print("power : ");
        int power = sc.nextInt();

        // calculating the power using while
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result = result * number;
            counter++;
        }
        System.out.print(result);
    }
}
