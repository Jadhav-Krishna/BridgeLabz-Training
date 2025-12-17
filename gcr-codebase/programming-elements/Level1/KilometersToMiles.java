// Import all the library from util pakage
import java.util.*;

// Creating a class name KilometersToMiles , for calculating Kilometer into Miles
class KilometersToMiles{
	
	// Creating a main method to execute the program
	public static void main(String[] args){

		// Creating a variable named kilometer , which store the value in it
		double kilometers = 10.8;

		// Creating a variable named miles , which store the value in it
		double mile = kilometers + kilometers*0.621371 ;
		
		// Print kilometers km in miles
		System.out.print("The distance "+ kilometers + "km in miles is "+ mile);
	}
}