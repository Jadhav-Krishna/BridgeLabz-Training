import java.util.*;

public class CoffeeCounterCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0.0;

        while (true) {
            System.out.println("(espresso, latte, cappuccino) or 'exit' :");
            String coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                break;
            }

            System.out.println("quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double pricePerCup;

            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 3.00;
                    break;
                case "latte":
                    pricePerCup = 4.00;
                    break;
                case "cappuccino":
                    pricePerCup = 4.50;
                    break;
                default:
                    System.out.println("Invalid");
                    continue;
            }

            double bill = pricePerCup * quantity;
            double gst = bill * 0.07;
            double totalForThisOrder = bill + gst;

            totalBill += totalForThisOrder;

            System.out.printf("Bill ", quantity, coffeeType, totalForThisOrder, gst);
        }

        System.out.printf("total ", totalBill);
        sc.close();
    }
}
