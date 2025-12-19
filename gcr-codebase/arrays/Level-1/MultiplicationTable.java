// Created a class 
import java.util.*;
class MultiplicationTable{

	// Writing the logic to multiplication table of a number.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[11];
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		for(int i = 0 ; i <= 10 ; i++){
			array[i] = number * i;
			System.out.println(number +" * "+ i +" = "+array[i]);
		}
			
		// Close the Scanner class
		sc.close();
	}
}