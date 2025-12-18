// Created a class , and 
import java.util.*;
class SmallestOfNumbers{

	// Writing the logic to find the first number is smallest.
	public static boolean SmallestNumber(int number1,int number2,int number3){
		if((number1 < number2) && (number1 < number3)){
			return true;
		}
		return false;
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("number 1 : ");
		int number1 = sc.nextInt();
		System.out.print("number 2 : ");
		int number2 = sc.nextInt();
		System.out.print("number 3 : ");
		int number3 = sc.nextInt();
		
		// Function initialisation
		System.out.print(SmallestNumber(number1,number2,number3));
		
		// Close the Scanner class
		sc.close();
	}
}