import java.util.*;
// Check if numbers are positive, negative, odd or even and compare first and last number
public class PositiveNegativeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("numbers: ");
            numbers[i] = sc.nextInt();
        }
        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " positive and even");
                } else {
                    System.out.println(number + " positive and odd");
                }
            } else {
                System.out.println(number + " negative");
            }
        }
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than last number");
        } else if (comparisonResult == -1) {
            System.out.println("First number is less than last number");
        } else {
            System.out.println("First number is equal to last number");
        }
    }
    // check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    // check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
}
