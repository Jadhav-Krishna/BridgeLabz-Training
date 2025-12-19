import java.util.*;

// Create a program to find all the multiples of a number taken as user input below 100.
// taking user input
public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

//      finding the multiples of the number below 100
        System.out.println("Multiples are : ");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
