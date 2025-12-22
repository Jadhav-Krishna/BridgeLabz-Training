import java.util.*;
// program to check various properties of a number
class NumberChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digitsArray = storeDigits(number, count);
        boolean isDuck = isDuckNumber(digitsArray);
        boolean isArmstrong = isArmstrongNumber(digitsArray, count);
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digitsArray);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestAndSecondLargest));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestAndSecondSmallest));
    }
// count digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    // store digits in an array
    public static int[] storeDigits(int number, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
// check if duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
// check if armstrong number
    public static boolean isArmstrongNumber(int[] digits, int count) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }
// find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
}