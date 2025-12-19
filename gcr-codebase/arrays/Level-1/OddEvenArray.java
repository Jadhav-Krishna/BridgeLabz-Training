// Created a class 
import java.util.*;
class OddEvenArray{

	// Writing the logic to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. .
	// Main method with a scanner object
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		if(number > 0){
			int size = (number/2)+1;
			int odd[] = new int[size];
			int even[] = new int[size];
			int oddVar = 0;
			int evenVar = 0;
			for(int i = 0 ; i <= number ; i++){
				if(i%2 == 0){
					even[evenVar] = i;
					evenVar++;
				}else{
					odd[oddVar] = i;
					oddVar++;
				}
			}
			System.out.println(Arrays.toString(even));
			System.out.println(Arrays.toString(odd));
		}
			
		// Close the Scanner class
		sc.close();
	}
}