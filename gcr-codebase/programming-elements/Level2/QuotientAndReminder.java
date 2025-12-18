// Initialising the class and the main method
import java.util.*;
class QuotientAndReminder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        float quotient = (float) number1 / number2;
        double reminder = number1 % number2;

        // Displaying the output in the proper format
        System.out.print("The Quotient is "+ quotient +" and Reminder is "+ reminder +" of two number "+ number1 +" and "+ number2);
    }
}