// Initialising the class and the main method
import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and build calculator
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Displaying the output in the proper format
        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 +" is "+ addition +","+ subtraction +","+ multiplication +",and "+division);
    }
}