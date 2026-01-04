package org.scenario.CabbyGo;

public class Ride implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(Vehicle vehicle, Driver driver, double distance) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.distance = distance;
    }

    @Override
    public void bookRide() {
        fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked with " + driver.getName() +
                " | Vehicle: " + vehicle.getVehicleNumber());
    }

    @Override
    public void endRide() {
        System.out.println("Ride completed. Fare = ₹" + fare);
    }

    public double getFare() {
        return fare;
    }
}
