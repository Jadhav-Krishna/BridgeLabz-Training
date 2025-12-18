// Created a class , and main method with a scanner object
import java.util.*;
class DivisivleByFive{

	// Writing the logic to find the number is divisible by 5 or not.
    public static boolean CheckDivisible(int number) {
        for (int i = 1; i < number; i++) {
            if (number % 5 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int number = sc.nextInt();
		
		
		// Function initialisation
		 System.out.print(CheckDivisible(number));
		
		// Close the Scanner class
		sc.close();
	}
}