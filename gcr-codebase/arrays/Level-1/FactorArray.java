// Created a class 
import java.util.*;
class FactorArray{

	// Writing the logic find the factors of a number taken as user input, store the factors in an array, and display the factors.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		int array[] = new int[10];
		for(int i = 1 ; i < number ; i++){
			if(number % i == 0){
				int idx = 0;
				array[i] = i;
			}
		}
		System.out.print(Arrays.toString(array));
			
		// Close the Scanner class
		sc.close();
	}
}