import java.util.*;
// generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
public class RandomGeneratives {
    public static void main() {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
// generate an array of specified size with 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
// find average, minimum, and maximum of an array of integers
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}
