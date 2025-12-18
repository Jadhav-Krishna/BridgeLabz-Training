// Created a class , and 
import java.util.*;
class MultiplicationTable{

    // Writing the logic to Calculate multiplication of table.
    public static void Multiplication(int number){
        for (int i = 6; i <= 9 ; i++) {
            System.out.println(number + " X " + i +" = "+(number*i));
        }
    }

    // Main method with a scanner object
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("number : ");
        int number = sc.nextInt();

        // Function initialisation
        Multiplication(number);

        // Close the Scanner class
        sc.close();
    }
}