import java.util.*;
// Create a program to find the factors of a number taken as user input with while loop.
public class FactorWhile {
//    taking the input from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

//      finding the factors of the number
        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
