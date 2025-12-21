import  java.util.*;

// Unit convertor for pounds to kilograms, kilograms to pounds, gallons to liters, liters to gallons
public class UnitConvertorWeight {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pounds : ");
        System.out.println(convertPoundsToKilograms(scanner.nextDouble()));
        System.out.print("Kilograms : ");
        System.out.println(convertKilogramsToPounds(scanner.nextDouble()));
        System.out.print("Gallons : ");
        System.out.println(convertGallonsToLiters(scanner.nextDouble()));
        System.out.print("Liters : ");
        System.out.println(convertLitersToGallons(scanner.nextDouble()));
    }
    // convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    // convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    // convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    // convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
