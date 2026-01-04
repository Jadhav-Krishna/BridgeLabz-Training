package org.scenario.CabbyGo;

public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, 20);
    }

    @Override
    public double calculateFare(double distance) {
        return 120 + (distance * ratePerKm);
    }
}
