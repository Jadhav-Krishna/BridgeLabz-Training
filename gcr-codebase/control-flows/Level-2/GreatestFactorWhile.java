import java.util.*;

public class GreatestFactorWhile {
//    taking the input from the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

// finding the greatest factor of the number
        int greatestFactor = 1;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                greatestFactor = i;

            }
        }
        i++;
        System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);
    }
}