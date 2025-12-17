// Import all the library from util pakage
import java.util.*;

// Creating a AgeOfHarry class , for calculating the age of harry in 2024
class AgeOfHarry{

	// Creating a main method to execute the program
	public static void main(String[] args){
		
		// Creating a variable to store the birth year of harry
		int harryBirthYear = 2000;

		// Creating another variable of name  currentYear
		int currentYear = 2024;
		
		// Calculating the age of Harry
		int harryAge = currentYear - harryBirthYear;

		// Print the age of harry
		System.out.print(harryAge);
	}
}