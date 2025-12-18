// Created a class , and 
import java.util.*;
class Factorial{

    // Writing the logic to find factorial of a number.
    public static int FactorialNumber(int number){
        int sum = 1;
        while(number > 0){
            sum *= number;
            number--;
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
        System.out.println(FactorialNumber(number));

        // Close the Scanner class
        sc.close();
    }
}