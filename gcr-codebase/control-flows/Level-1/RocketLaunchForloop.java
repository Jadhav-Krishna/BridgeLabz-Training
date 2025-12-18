// Created a class , and 
import java.util.*;
class RocketLaunchForloop{

	// Writing the logic to check whether a number is positive, negative, or zero.
	public static void Launch(int countDown){
		int count = countDown ; 
		for(;count > 0;count--){
			System.out.println(count);
		}
		if(count == 0){
			System.out.print("Rocket Launched");
		}
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Count Down Number : ");
		int countDown = sc.nextInt();
		
		// Function initialisation
		Launch(countDown);
		
		// Close the Scanner class
		sc.close();
	}
}