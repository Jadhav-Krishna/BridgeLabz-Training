import java.util.*;

//	Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// taking input from the user
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        // count number of digits in the number and save digits in array
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.println(digits[i]);
        }

        sc.close();
    }
}
