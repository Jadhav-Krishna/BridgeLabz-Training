import java.util.*;

//	Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// taking input from the user
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        // count number of digits in the number and save them in an array
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

        // frequency of each digit in the number
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(frequency));

        sc.close();
    }
}
