// Initialising the class and the main method
import java.util.*;
class EquallyDividedPen{
	public static void main(String[] args){

		// initialising the Variable and calculating
		int pen = 14;
		int student = 3;
		int notDistributed = pen % student;
		int equallyDividedPen = (pen - notDistributed)/student;

		// Displaying the output in the proper format
		System.out.print("The Pen Per Student is " + equallyDividedPen +" and the remaining pen not distributed is "+ notDistributed);
	}
}