// Initialising the class and the main method
import java.util.*;
class ProfitLoss{
	public static void main(String[] args){

		// initialising the Variable and calculating the profit or loss
		int costPrice = 129;
		int sellPrice = 191;
		int profit = sellPrice - costPrice;
		int profitPercentage = (profit*100)/costPrice;

		// Displaying the outpurt in the proper format
		System.out.print("The Cost Price is INR "+ costPrice +" and Selling Price is INR " + sellPrice);
		System.out.print("The Profit is INR "+ profit +" and the Profit Percentage is " + profitPercentage +" %");
	}
}