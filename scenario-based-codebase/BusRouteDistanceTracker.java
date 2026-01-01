import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDistance = 0;
        String continueJourney;

        do {
            System.out.print("Enter distance to next stop (in km): ");
            int distanceToNextStop = scanner.nextInt();
            totalDistance += distanceToNextStop;
            System.out.println("Total distance traveled: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            continueJourney = scanner.next();
        } while (continueJourney.equalsIgnoreCase("no"));

        System.out.println("You have exited the bus. Total distance traveled: " + totalDistance + " km");
        scanner.close();
    }
}
