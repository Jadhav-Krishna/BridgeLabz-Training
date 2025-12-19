// Created a class , and 
import java.util.*;
class SwitchCaseCalculator{

	// Writing the logic to Create a Switch Case Calculator.
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Enter 1st number: ");
        	double a = sc.nextDouble();

        	System.out.print("Enter 2nd number: ");
        	double b = sc.nextDouble();

        	System.out.print("Enter operator : ");
        	char choice = sc.next().charAt(0);

        	switch (choice) {
            		case '+':
                		System.out.println("Result: " + (a + b));
                		break;
            		case '-':
                		System.out.println("Result: " + (a - b));
                		break;
            		case '*':
                		System.out.println("Result: " + (a * b));
                		break;
            		case '/':
                		System.out.println("Result: " + (a / b));
                		break;
            		default:
                		System.out.println("Enter correct Choice");
        		}
		
		// Close the Scanner class
		sc.close();
	}
}