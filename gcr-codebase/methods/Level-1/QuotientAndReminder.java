// Initialising the class and the main method
import java.util.*;
class QuotientAndReminder {

	public static int[] quotientAndReminder(int number1,int number2){
		int array[] = new int[2];
		array[0] =  (Integer)number1 / number2;
        	array[1] = (Integer)number1 % number2;
		return array;
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


        // Displaying the output in the proper format
        System.out.print(Arrays.toString(quotientAndReminder(number1,number2)));
    }
}