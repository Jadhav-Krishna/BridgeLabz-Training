import java.util.Scanner;
public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of visitors: ");
        int numberOfVisitors = scanner.nextInt();

        for (int i = 1; i <= numberOfVisitors; i++) {
            System.out.print("Visitor " + i + ", enter your drawn number: ");
            int drawnNumber = scanner.nextInt();
            if (drawnNumber < 0) {
                System.out.println("Invalid input.");
                continue;
            }

            // Check if the number is divisible by both 3 and 5
            if (drawnNumber % 15 == 0) {
                System.out.println("Congratulations Visitor " + i + "! You win a gift!");
            } else {
                System.out.println("Sorry Visitor " + i + ", better luck next time.");
            }
        }
        scanner.close();
    }
}