package org.scenario.CabbyGo;

public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + (distance * ratePerKm);
    }
}
