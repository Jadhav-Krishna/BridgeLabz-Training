// Created a class , and 
import java.util.*;
class ArmstrongNumbers{

	// Writing the logic to find the Armstrong Number.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		while(temp > 0){
			int temp3 =  temp % 10;
			sum += Math.pow(temp3, 3);
			temp /= 10;
		}
		if(number == sum){
			System.out.print("Armstrong Number");
		}else{
			System.out.print("Not an Armstrong Number");
		}

		
		// Close the Scanner class
		sc.close();
	}
}