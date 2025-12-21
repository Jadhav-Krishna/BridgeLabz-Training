import java.util.*;

public class UnitConvertor {
    // taking input from user and converting units
    // convert kilometers to miles, miles to kilometers, meters to feet and feet to meters
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilometer : ");
        System.out.println(convertKmToMiles(scanner.nextInt()));
        System.out.print("Miles : ");
        System.out.println(convertMilesToKm(scanner.nextInt()));
        System.out.print("Meter : ");
        System.out.println(convertMetersToFeet(scanner.nextInt()));
        System.out.print("feet : ");
        System.out.println(convertFeetToMeters(scanner.nextInt()));
    }
    // convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    // convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    // convert meters to feet and feet to meters
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    // convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
}
