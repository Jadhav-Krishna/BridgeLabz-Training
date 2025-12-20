// Created a class , and 
import java.util.*;
class SpringSeason{

	// Writing the logic  that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
	public static String IsSpring(int month, int day){
		if(month >= 3 || month <= 6){
			if(month == 3 && day >= 20 && day <= 31){
				return "Its a Spring Season";
			}else if(month < 3 && month > 6 && day >= 1 && day <= 30){
				return "Its a Spring Season";
			}else if(month < 3 && month > 6 && day >= 1 && day <= 31){
				return "Its a Spring Season";
			}else if(month == 6 && day >= 1 && day <= 20){
				return "Its a Spring Season";
			}else{
				return "Not a Spring Season";
			}
		}
		return "Not a Spring Season";
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("month : ");
		int month = sc.nextInt();
		System.out.print("day : ");
		int day = sc.nextInt();
		
		// Function initialisation
		System.out.print(IsSpring(month,day));
		
		// Close the Scanner class
		sc.close();
	}
}