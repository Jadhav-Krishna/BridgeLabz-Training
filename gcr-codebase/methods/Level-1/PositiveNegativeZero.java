// Created a class 
import java.util.*;
class PositiveNegativeZero{

	// Writing the logic to check the multiple numbers are positive, Negative, Zero.
	// Main method with a scanner object

	static void check(int number){
		if(number > 0){
			System.out.println(number + " is Positive  ");
		}else if(number < 0){
			System.out.println(number + " is Negative  ");
		}else{
			System.out.println(number + " is Zero  ");
			return;
		}
		return;
	}	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		check(number);
		
		// Close the Scanner class
		sc.close();
	}
}