import  java.util.*;

// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
// taking input from the user
public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();
        int size = 10;
        int[] digits = new int[size];
        int index = 0;

        // store digits in array and find largest and second largest
        while (number != 0) {
            if (index == size) {
                break;
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        Arrays.sort(digits);

        // Display results
        System.out.println("Largest digit: " + digits[size - 1]);
        System.out.println("Second largest digit: " + digits[size - 2]);

        sc.close();
    }
}
