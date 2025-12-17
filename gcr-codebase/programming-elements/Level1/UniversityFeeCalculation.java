// Initialising the class and the main method
import java.util.*;
class UniversityFeeCalculation{
	public static void main(String[] args){

		// initialising the Variable and calculating the discount
		int universityFee = 125000;
		int universityDiscount = 10;
		int discountedAmount = 125000/10;
		int discountedPrice = universityFee - discountedAmount;

		// Displaying the output in the proper format
		System.out.print("The discount amount is INR "+ discountedAmount +" and final discounted fee is INR "+ discountedPrice);
	}
}