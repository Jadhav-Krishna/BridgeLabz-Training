// Created a class
import java.util.*;
class OddAndEven{

    // Writing the logic to find odd and even from 1 to user input.
    public static String EvenOdd(int number){
        for (int i = 1; i < number ; i++) {
            if(i % 2 == 0){
                System.out.println("Even : "+i);
            }else {
                System.out.println("Odd : "+i);
            }
        }
        return "";
    }

    // Main method with a scanner object
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("number : ");
        int number = sc.nextInt();

        // Function initialisation
        System.out.println(EvenOdd(number));

        // Close the Scanner class
        sc.close();
    }
}