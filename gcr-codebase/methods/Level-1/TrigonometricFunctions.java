// Initialising the class and the main method
import java.util.*;
class TrigonometricFunctions{
	// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
	public double[] calculateTrigonometricFunctions(double angle){
		double radians = Math.toRadians(angle);
		double[] result = new double[3];
        	result[0] = Math.sin(radians);
        	result[1] = Math.cos(radians);
        	result[2] = Math.tan(radians);
        	return result;
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating the Quotient And Reminder
        int angle = sc.nextInt();

	TrigonometricFunctions tf = new TrigonometricFunctions();
        // Displaying the output in the proper formate
        System.out.print(Arrays.toString(tf.calculateTrigonometricFunctions(angle)));
    }
}