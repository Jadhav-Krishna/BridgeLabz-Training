// Created a class 
import java.util.*;
class MultipleValueUntilZero{

	// Writing the logic to  store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[11];
		for(int i = 0 ; i <= 10 ; i++){
			System.out.print("Enter Number : ");
			array[i] = sc.nextInt();
			if(array[i] <= 0){
				break;
			}
		}
			
		// Close the Scanner class
		sc.close();
	}
}