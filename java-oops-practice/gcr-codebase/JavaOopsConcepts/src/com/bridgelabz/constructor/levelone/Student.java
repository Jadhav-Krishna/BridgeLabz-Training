// Create a class named 'Student' with three data members: 'rollNumber' (public), 'name' (protected), and 'CGPA' (private).
// Implement a constructor to initialize these data members. Provide public methods to get and set the 'CGPA' value. Also, include a method to display the student's details.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 8.5);
        student.displayDetails();

        // Modifying CGPA using public method
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}