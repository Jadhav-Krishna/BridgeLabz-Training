// Initialising the class and the main method
import java.util.*;
class CentimetersConvertsIntoFeetAndInches{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		// initialising the Variable and calculating the inch & foot
		double cm = input.nextInt();
		double inch = cm * 0.254;
		double foot = inch * 0.12;

		// Displaying the output in the proper format
		System.out.print("Your Height in cm is "+ cm +" while in feet is "+ foot +" and inches is "+ inch);
	}
}