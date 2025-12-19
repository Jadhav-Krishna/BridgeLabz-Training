// Created a class 
import java.util.*;
class StudentCanVote{

	// Writing the logic to check the multiple student can vote or not .
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int array[] = new int[11];
		for(int i = 0 ; i <= 10 ; i++){
			System.out.print("Enter your age : ");
			array[i] = sc.nextInt();
			if(array[i] >= 18){
				System.out.println(i + " vote, his/her age is "+array[i]);
			}
			
		}
		
		
		
		// Close the Scanner class
		sc.close();
	}
}