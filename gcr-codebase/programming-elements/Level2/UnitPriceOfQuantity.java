// Initialising the class and the main method
import java.util.*;
class UnitPriceOfQuantity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialising the Variable and calculating Unitprice of Quantity
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;


        // Displaying the output in the proper format
        System.out.print("The total purchase price is INR "+ unitPrice + " if the quantity "+ quantity + " and unit price is INR "+ totalPrice);
    }
}