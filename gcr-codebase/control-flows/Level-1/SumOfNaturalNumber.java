// Created a class , and 
import java.util.*;
class SumOfNaturalNumber{

	// Writing the logic to find the natural number and write the sum of n natural numbers 
	public static void NaturalNumber(int number){
		int count = 0;
		if(number < 1){
			System.out.print(number + " Not a Natural number");
			return;
		}
		count = number * (number + 1) / 2;
		System.out.print("The sum of "+ number +" natural numbers is "+ count);
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("number : ");
		int number = sc.nextInt();
		
		// Function initialisation
		NaturalNumber(number);
		
		// Close the Scanner class
		sc.close();
	}
}