// Initialising the class and the main method
import java.util.*;
class DoubleOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double operation1 = a + b *c;
        Double operation2 = a * b + c;
        Double operation3 = c + a / b;
        Double operation4 = a % b + c;


        // Displaying the output in the proper format
        System.out.println("The result of a + b * c is: " + operation1);
        System.out.println("The result of a * b + c is: " + operation2);
        System.out.println("The result of c + a / b is: " + operation3);
        System.out.println("The result of a % b + c is: " + operation4);
    }
}