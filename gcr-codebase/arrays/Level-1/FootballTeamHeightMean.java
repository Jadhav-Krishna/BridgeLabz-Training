// Created a class 
import java.util.*;
class FootballTeamHeightMean{

	// Writing the logic to multiplication table of a number.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[12];
		int sum = 0;
		for(int i = 0 ; i < 12 ; i++){
			System.out.print("Enter "+i+" Player Height : ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.print(sum/array.length);
			
		// Close the Scanner class
		sc.close();
	}
}