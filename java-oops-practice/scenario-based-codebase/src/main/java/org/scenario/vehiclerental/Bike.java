package org.scenario.vehiclerental;

public class Bike extends Vehicle {
    private double helmetFeePerDay = 2.0;

    public Bike(String registrationNumber, String model, double baseRatePerDay) {
        super(registrationNumber, model, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        double base = baseRatePerDay * days;
        double helmetFee = helmetFeePerDay * days;
        return base + helmetFee;
    }
}
