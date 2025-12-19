// Created a class 
import java.util.*;
class MultiplicationTableInRange{

	// Writing the logic to multiplication table of a number , from 6 to 9.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[10];
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		for(int i = 6 ; i <= 9 ; i++){
			array[i] = number * i;
			System.out.println(number +" * "+ i +" = "+array[i]);
		}
			
		// Close the Scanner class
		sc.close();
	}
}