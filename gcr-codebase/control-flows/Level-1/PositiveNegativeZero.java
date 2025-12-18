// Created a class , and 
import java.util.*;
class PositiveNegativeZero{

	// Writing the logic to check whether a number is positive, negative, or zero.
	public static String Check(int number){
		if(number > 0){
			return "Positive";
		}else if(number < 0){
			return "Negative";
		}else{
			return "Zero";
		}
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		
		// Function initialisation
		System.out.print(Check(number));
		
		// Close the Scanner class
		sc.close();
	}
}