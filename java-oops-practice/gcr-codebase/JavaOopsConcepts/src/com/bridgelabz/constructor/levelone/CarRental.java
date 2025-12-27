// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 50.0; // Assuming a fixed cost per day

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹ " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5);
        rental1.displayDetails();
    }
}