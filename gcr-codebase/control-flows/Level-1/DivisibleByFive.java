// Created a class , and main method with a scanner object
import java.util.*;
class SumOfNumberUntilZero{

	// Writing the logic to find the number is divisible by 5 or not.
	public static int UntilZero(int number){
		int sum = 0;
		while(number != 0){
			sum += number;
			number = sc.nextInt();
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int number = sc.nextInt();
		
		
		// Function initialisation
		// System.out.print(UntilZero(number));
		
		// Close the Scanner class
		sc.close();
	}
}