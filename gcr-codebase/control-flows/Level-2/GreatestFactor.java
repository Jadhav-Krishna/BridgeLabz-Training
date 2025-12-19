import java.util.*;

//Create a program to print the greatest factor of a number beside itself using a loop.
public class GreatestFactor {
//    taking the input from the user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

// finding the greatest factor of the number
        int greatestFactor = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                greatestFactor = i;
            }
        }
        System.out.println("Greatest factor of " + number + " beside itself is: " + greatestFactor);
    }
}
