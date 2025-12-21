import  java.util.*;

// Unit convertor for yards to feet, feet to yards, meters to inches, inches to meters, inches to centimeters
public class UnitConvertor {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yards : ");
        System.out.println(convertYardsToFeet(scanner.nextDouble()));
        System.out.print("Feet : ");
        System.out.println(convertFeetToYards(scanner.nextDouble()));
        System.out.print("Meters : ");
        System.out.println(convertMetersToInches(scanner.nextDouble()));
        System.out.print("Inches : ");
        System.out.println(convertInchesToMeters(scanner.nextDouble()));
        System.out.print("Inches to Centimeters : ");
        System.out.println(convertInchesToCentimeters(scanner.nextDouble()));
    }
    // convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    // convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    // convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    // convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    // convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}
