// Created a class 
import java.util.*;
class DayOfWeek{

	// Writing the logic to takes a date as input and prints the day of the week.
	// Main method with a scanner object
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input as command-line arguments
		int m = Integer.parseInt(args[0]);
        	int d = Integer.parseInt(args[1]);
        	int y = Integer.parseInt(args[2]);
        	int y0 = y - (14 - m) / 12;
        	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        	int m0 = m + 12 * ((14 - m) / 12) - 2;
        	int d0 = (d + x + (31 * m0) / 12) % 7;
		System.out.println(d0);
		
		// Close the Scanner class
		sc.close();
	}
}