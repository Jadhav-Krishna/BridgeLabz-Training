// Created a class , and 
import java.util.*;
class DigitCounter{

	// Writing the logic to find the Digit count.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int count = 0;
		while(number > 0){
			count++;
			number /= 10;
		}
		System.out.print(count);
		
		// Close the Scanner class
		sc.close();
	}
}