// Initialising the class and the main method
import java.util.*;
class UniversityFeeCalculationInput{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

		// initialising the Variable and calculating the discount
		int universityFee = sc.nextInt();
		int universityDiscount = sc.nextInt();
		int discountedAmount = (125000/100)*universityDiscount;
		int discountedPrice = universityFee - discountedAmount;

		// Displaying the output in the proper format
		System.out.print("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+ discountedPrice);
	}
}