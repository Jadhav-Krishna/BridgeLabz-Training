// Created a class , and 
import java.util.*;
class FactorialFor{

    // Writing the logic to find factorial of a number.
    public static int FactorialNumberFor(int number){
        int sum = 1;
        for (int i = 1; i < number; i++) {
            sum *= i;
        }
        return sum;
    }

    // Main method with a scanner object
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("number : ");
        int number = sc.nextInt();

        // Function initialisation
        System.out.println(FactorialNumberFor(number));

        // Close the Scanner class
        sc.close();
    }
}