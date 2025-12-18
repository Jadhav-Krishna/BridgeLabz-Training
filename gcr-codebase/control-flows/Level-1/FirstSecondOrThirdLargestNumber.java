// Created a class , and
import java.util.*;
class FirstSecondOrThirdLargestNumber{

    // Writing the logic to find the first number is smallest.
    public static void LargestNumber(int number1,int number2,int number3){
        // find first largest
        if((number1 >= number2) && (number1 >= number3)){
            System.out.println("The first largest is : " + number1);
            // now second and third between number2 and number3
            if(number2 >= number3){
                System.out.println("The 2nd largest is : " + number2);
                System.out.println("The 3rd largest is : " + number3);
            } else {
                System.out.println("The 2nd largest is : " + number3);
                System.out.println("The 3rd largest is : " + number2);
            }
        } else if((number2 >= number1) && (number2 >= number3)){
            System.out.println("The first largest is : " + number2);
            // now second and third between number1 and number3
            if(number1 >= number3){
                System.out.println("The 2nd largest is : " + number1);
                System.out.println("The 3rd largest is : " + number3);
            } else {
                System.out.println("The 2nd largest is : " + number3);
                System.out.println("The 3rd largest is : " + number1);
            }
        } else {
            System.out.println("The first largest is : " + number3);
            // now second and third between number1 and number2
            if(number1 >= number2){
                System.out.println("The 2nd largest is : " + number1);
                System.out.println("The 3rd largest is : " + number2);
            } else {
                System.out.println("The 2nd largest is : " + number2);
                System.out.println("The 3rd largest is : " + number1);
            }
        }
        return;
    }

    // Main method with a scanner object
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("number 1 : ");
        int number1 = sc.nextInt();
        System.out.print("number 2 : ");
        int number2 = sc.nextInt();
        System.out.print("number 3 : ");
        int number3 = sc.nextInt();

        // Function initialisation
        LargestNumber(number1,number2,number3);

        // Close the Scanner class
        sc.close();
    }
}