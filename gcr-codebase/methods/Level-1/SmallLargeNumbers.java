// Created a class 
import java.util.*;
class SmallLargeNumbers{

	// Writing the logic to find the first number is smallest.
	public static int[] smallLargeNumbers(int a,int b,int c){
		int[] arr = new int[2];
		int i = 0;
		arr[i] = (Math.max(Math.max(a,b),c));
		i++;
		arr[i] = (Math.min(Math.min(a,b),c));
		return arr;
	}

	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("number 1 : ");
		int number1 = sc.nextInt();
		System.out.print("number 2 : ");
		int number2 = sc.nextInt();
		System.out.print("number 3 : ");
		int number3 = sc.nextInt();
		
		// Function initialisation
		System.out.print(Arrays.toString(smallLargeNumbers(number1,number2,number3)));
		
		// Close the Scanner class
		sc.close();
	}
}