// Created a class , and 
import java.util.*;
class LeapYearLogical{

	// Writing the logic to find the year is leap year or not with Logical.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Year : ");
		int year = sc.nextInt();
		if(year >= 1582){
			if(year % 100 == 0 && year % 400 == 0){
				System.out.print("A Leap year");
			}else if(year % 4 == 0){
				System.out.print("A Leap year");
			}else{
				System.out.print("Not a Leap year");
			}
			
		}else{
			System.out.print("Not a Leap year");
		}
		
		// Close the Scanner class
		sc.close();
	}
}