import java.util.*;

// Create a program to find the power of a number.
// taking user input
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int number = sc.nextInt();
        System.out.print("power : ");
        int power = sc.nextInt();

//      calculating the power
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.print(result);
    }
}
