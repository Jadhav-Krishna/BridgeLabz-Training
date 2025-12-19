import java.util.*;

//  Rewrite the program to find all the multiples of a number below 100 using while loop.
// taking input from the user.
public class MultiplesOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

//       finding the multiples of the number
        System.out.println("Multiples are : ");
        int i = 99;
        while (i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
