package org.scenario.vehiclerental;

public class Truck extends Vehicle {
    private double loadSurchargePerDay = 25.0;
    private int loadCharge = 3000;

    public Truck(String registrationNumber, String model, double baseRatePerDay) {
        super(registrationNumber, model, baseRatePerDay);
    }

    @Override
    public double calculateRent(int days) {
        double base = baseRatePerDay * days;
        double loadSurcharge = loadSurchargePerDay * days;
        return base + loadSurcharge + loadCharge;
    }
}
