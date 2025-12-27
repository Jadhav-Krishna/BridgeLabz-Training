// Create an Employee class with different access modifiers for its members and a subclass Manager that demonstrates access to these members.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Subclass Manager
    public static class Manager extends Employee {
        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        // Method to display Manager details
        public void displayManagerDetails() {
            System.out.println("Manager Employee ID: " + employeeID); // public member
            System.out.println("Manager Department: " + department); // protected member
            System.out.println("Manager Salary: " + getSalary()); // private member via public method
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1001, "IT", 75000.0);
        System.out.println("Employee Salary: " + employee.getSalary());

        Manager manager = new Manager(2001, "HR", 90000.0);
        manager.displayManagerDetails();
    }
}