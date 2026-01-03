package org.scenario.vehiclerental;

public class VehicleRentalRunner {
    public static void main(String[] args) {
        Vehicle car = new Car("BR05KA1222", "Verna", 500.0);
        Vehicle bike = new Bike("MP12MF5039", "HeroHonda Splender", 180.0);
        Vehicle truck = new Truck("HR09CF3970", "Chota Hathi", 750.0);

        int days = 3;
        System.out.println("-- Summary for " + days + " days --");
        printRent(car, days);
        printRent(bike, days);
        printRent(truck, days);
    }

    private static void printRent(Vehicle vehicle, int days) {
        double amount = vehicle.calculateRent(days);
        System.out.println(vehicle.getSummary() + ", days=" + days + ", total=" + amount);
    }
}

