// Created a class , and 
import java.util.*;
class ArmstrongNumbers{

	// Writing the logic to find the year is leap year or not.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Number : ");
		int number = sc.nextInt();
		int count = 0;
		int temp1 = number;
		int temp2 = number;
		while(temp1 > 0){
			count++;
			temp1 /= 10;
		}
		int sum = 0;
		while(temp2 > 0){
			int temp3 =  temp2 % 10;
			sum += Math.pow(temp3, count);
			temp2 /= 10;
		}
		if(number == sum){
			System.out.print("Armstrong Number");
		}else{
			System.out.print("Armstrong Number");
		}

		
		// Close the Scanner class
		sc.close();
	}
}