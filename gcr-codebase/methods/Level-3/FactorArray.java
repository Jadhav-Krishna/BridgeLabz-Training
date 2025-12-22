import java.util.*;
// program to find factors of a number and perform various operations on them
class FactorArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int[] factorsArray = findFactors(number);
        System.out.println("Factors Array: " + Arrays.toString(factorsArray));
        System.out.println("Greatest Factor: " + findGreatestFactor(factorsArray));
        System.out.println("Sum of Factors: " + sumOfFactors(factorsArray));
        System.out.println("Product of Factors: " + productOfFactors(factorsArray));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factorsArray));
    }
    // factors of a number
    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList;
    }
    // greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }
    // sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // product of the cube of the factors
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}