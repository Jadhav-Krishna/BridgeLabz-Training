package org.scenario.CabbyGo;

public abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

