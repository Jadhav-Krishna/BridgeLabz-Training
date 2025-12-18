// Created a class , and main method with a scanner object
import java.util.*;
class SumOfNumberUntilZero{

	// Writing the logic to find the sum until the user does't enter 0.
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int sum = 0;
		int num = 1;
		while(num > 0){
			sum += num;
			num = sc.nextInt();
		}
		System.out.print(sum-1);
		
		// Close the Scanner class
		sc.close();
	}
}