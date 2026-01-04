package org.scenario.CabbyGo;

public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, 15);
    }

    @Override
    public double calculateFare(double distance) {
        return 80 + (distance * ratePerKm);
    }
}
