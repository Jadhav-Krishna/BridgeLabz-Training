// Created a class , and 
import java.util.*;
class FirstSecondOrThirdLargestNumber{

	// Writing the logic to find the first number is smallest.
	public static void LargestNumber(int number1,int number2,int number3){
		if((number1 > number2) && (number1 > number3)){
			System.out.print("The first largest is : "+number1);
		};
		if((number1 > number2) && (number1 < number3)){
			System.out.print("The 2nd largest is : "+number2);
		};
		if((number1 < number2) && (number2 < number3) ){
			System.out.print("The 2nd largest is : "+number2);
		};
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
		System.out.print(LargestNumber(number1,number2,number3));
		
		// Close the Scanner class
		sc.close();
	}
}