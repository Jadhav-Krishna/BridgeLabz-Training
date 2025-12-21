import java.util.*;

public class Factors {
    // Taking input from user and displaying factors, sum, product, and sum of squares of factors
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        int sumOfSquares = sumOfSquareOfFactors(factors);
        System.out.println("Sum of square of factors: " + sumOfSquares);
    }
    // Function to find factors of a number
    static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create an array to save the factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // calculate sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // calculate product of factors
    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // calculate sum of square of factors
    static int sumOfSquareOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}
