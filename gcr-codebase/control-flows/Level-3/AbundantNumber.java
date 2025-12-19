// Created a class , and 
import java.util.*;
class AbundantNumber{

	// Writing the logic to check Abundant Number or not.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i < number ; i++){
			if(number%i == 0){
				sum += i;
			}
		}
		if(sum > number) {
			System.out.print("Abundant Number");
		}else{
			System.out.print("not a Abundant Number");
		};

		// Close the Scanner class
		sc.close();
	}
}