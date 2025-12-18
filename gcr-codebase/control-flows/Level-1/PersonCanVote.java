// Created a class , and 
import java.util.*;
class PersonCanVote{

	// Writing the logic to check whether a person can vote
	public static void CanVote(int age){
		int count = 0;
		if(age >= 18){
			System.out.print("The person's age is "+ age +" and can vote.");
			return;
		}else{
			System.out.print("The person's age is "+ age +" and cannot vote.");
			return;
		}
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Age : ");
		int age = sc.nextInt();
		
		// Function initialisation
		CanVote(age);
		
		// Close the Scanner class
		sc.close();
	}
}