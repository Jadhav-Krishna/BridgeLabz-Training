package org.scenario.vehiclerental;

public abstract class Vehicle implements Rentable {
    protected String registrationNumber;
    protected String model;
    protected double baseRatePerDay;

    protected Vehicle(String registrationNumber, String model, double baseRatePerDay) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.baseRatePerDay = baseRatePerDay;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getBaseRatePerDay() { return baseRatePerDay; }
    public void setBaseRatePerDay(double baseRatePerDay) { this.baseRatePerDay = baseRatePerDay; }

    public String getSummary() {
        return "Vehicle{" +
                "registration='" + registrationNumber + '\'' +
                ", model='" + model + '\'' +
                ", baseRatePerDay=" + baseRatePerDay +
                '}';
    }
}
