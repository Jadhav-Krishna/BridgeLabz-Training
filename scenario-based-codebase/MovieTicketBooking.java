import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();
        for (int i = 1; i <= customers; i++) {

            System.out.println("\nCustomer " + i);

            System.out.println("Select Movie Type:");
            System.out.println("1. Holly");
            System.out.println("2. Bolly");
            System.out.println("3. Trolly");
            int movieType = sc.nextInt();
            int basePrice = 0;
            switch (movieType) {
                case 1:
                    basePrice = 200;
                    break;
                case 2:
                    basePrice = 300;
                    break;
                case 3:
                    basePrice = 400;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }
            System.out.print("Select Seat Type (Gold/Silver): ");
            String seatType = sc.next();

            int seatCharge = 0;
            if (seatType.equalsIgnoreCase("Gold")) {
                seatCharge = 100;
            } else if (seatType.equalsIgnoreCase("Silver")) {
                seatCharge = 70;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }
            System.out.print("Do you want snacks? (Yes/No): ");
            String snacks = sc.next();
            int snackCharge = 0;
            if (snacks.equalsIgnoreCase("Yes")) {
                snackCharge = 800;
            }
            int totalAmount = basePrice + seatCharge + snackCharge;
            System.out.println("Total Price: ₹" + totalAmount);
        }
        sc.close();
    }
}
