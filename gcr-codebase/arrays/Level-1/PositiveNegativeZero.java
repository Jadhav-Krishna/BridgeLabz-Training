// Created a class 
import java.util.*;
class PositiveNegativeZero{

	// Writing the logic to check the multiple numbers are positive, Negative, Zero.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[6];
		for(int i = 0 ; i <= 5 ; i++){
			System.out.print("Enter Number : ");
			array[i] = sc.nextInt();
			if(array[i] > 0){
				System.out.println(i + " is Positive : "+array[i]);
			}else if(array[i] < 0){
				System.out.println(i + " is Negative : "+array[i]);
			}else{
				System.out.println(i + " is Zero : "+array[i]);
			}
		}
		
		// Close the Scanner class
		sc.close();
	}
}