package org.scenario.vehiclerental;

public class Car extends Vehicle {
    private double insurancePerDay = 15.0;
    private int luxuryCharge = 1000;

    public Car(String registrationNumber, String model, double baseRatePerDay) {
        super(registrationNumber, model, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        double base = baseRatePerDay * days;
        double insurance = insurancePerDay * days;
        return base + insurance + luxuryCharge;
    }
}
