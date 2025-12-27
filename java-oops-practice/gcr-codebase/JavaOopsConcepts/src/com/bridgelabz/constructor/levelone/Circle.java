import java.util.*;
package com.bridgelabz.constructor.levelone;
// Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(13.0);
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();
        System.out.println();
        Circle paramCircle = new Circle(5.0);
        paramCircle.displayDetails();
    }
}