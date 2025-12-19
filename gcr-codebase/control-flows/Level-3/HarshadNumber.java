// Created a class , and 
import java.util.*;
class HarshadNumber{

	// Writing the logic to check Harshad Number or not.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number /= 10;
		}
		if(temp % sum == 0) {
			System.out.print("Harshad Number");
		}else{
			System.out.print("not a Harshad Number");
		};

		// Close the Scanner class
		sc.close();
	}
}