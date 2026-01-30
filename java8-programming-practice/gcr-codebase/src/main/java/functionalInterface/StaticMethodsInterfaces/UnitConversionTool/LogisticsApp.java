package functionalInterface.StaticMethodsInterfaces.UnitConversionTool;

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        double miles = UnitConverter.kmToMiles(distanceKm);
        double lbs = UnitConverter.kgToLbs(weightKg);
        double km = UnitConverter.milesToKm(miles);
        double kg = UnitConverter.lbsToKg(lbs);	

        System.out.println("Distance: " + miles + " miles");
        System.out.println("Weight: " + lbs + " lbs");
        System.out.println("Converted back: " + km + " km");
        System.out.println("Converted back: " + kg + " kg");
    }
}
