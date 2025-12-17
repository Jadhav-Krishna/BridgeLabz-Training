// Import all the library from util pakage
import java.util.*;

// Creating a class name SamAveragePercentage , for calculating his average percentage in PCM
class SamAveragePercent{
	
	// Creating a main method to execute the program
	public static void main(String[] args){
	
		// Creating a variable samMathsMark to store his maths marks
		int samMathsMark = 94;

		// Creating a variable samPhysicsMark to store his maths marks
		int samPhysicsMark = 95;

		// Creating a variable samChemistryMark to store his maths marks
		int samChemistryMark = 96;

		// Calculating Sam's average percentage in PCM
		int samAverageMarkPCM = ((samMathsMark + samPhysicsMark + samChemistryMark)*100)/300;

		// Print Sam's average percentage in PCM
		System.out.print(samAverageMarkPCM);
	}
}