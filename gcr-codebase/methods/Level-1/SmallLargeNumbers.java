// Created a class 
import java.util.*;
class SmallLargeNumbers{

	// Writing the logic to find the first number is smallest.
	public static void smallLargeNumbers(int a,int b,int c){
		System.out.println(Math.max(Math.max(a,b),c)+" is Maximum");
		System.out.print(Math.min(Math.min(a,b),c)+" is Minimum");
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
		smallLargeNumbers(number1,number2,number3);
		
		// Close the Scanner class
		sc.close();
	}
}