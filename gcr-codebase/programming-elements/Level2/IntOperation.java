// Initialising the class and the main method
import java.util.*;
class IntOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int operation1 = a + b *c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;


        // Displaying the output in the proper format
        System.out.println("The result of a + b * c is: " + operation1);
        System.out.println("The result of a * b + c is: " + operation2);
        System.out.println("The result of c + a / b is: " + operation3);
        System.out.println("The result of a % b + c is: " + operation4);
    }
}