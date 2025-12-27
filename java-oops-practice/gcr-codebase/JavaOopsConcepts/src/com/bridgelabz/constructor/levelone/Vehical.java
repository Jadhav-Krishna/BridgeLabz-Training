// Attributes: ownerName (String), vehicleType (String), and a static attribute registrationFee (double) initialized to 1000.0.
// Constructor: A parameterized constructor to initialize ownerName and vehicleType.
// Methods: An instance method displayVehicleDetails() to print the vehicle's details, and a class method updateRegistrationFee(double newFee) to update the registrationFee.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class Vehical {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000.0;

    // Parameterized constructor
    public Vehical(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹ " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehical vehicle1 = new Vehical("Rajesh Kumar", "Car");
        Vehical vehicle2 = new Vehical("Anita Singh", "Motorcycle");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update registration fee
        Vehical.updateRegistrationFee(1500.0);
        System.out.println("Updated Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}