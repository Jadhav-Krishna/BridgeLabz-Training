// Created a class , and 
import java.util.*;
class IsPrime{

	// Writing the logic to check the given number is a prime number or not.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int count = 0;
		boolean isPrime;
		for(int i = 2; i < number ; i++){
			if(number % i == 0){
				count++;
			}
		}
		if(count == 0){
			isPrime = true;
		}else{
			isPrime = false;
		}
		System.out.print(isPrime);
		
		// Close the Scanner class
		sc.close();
	}
}