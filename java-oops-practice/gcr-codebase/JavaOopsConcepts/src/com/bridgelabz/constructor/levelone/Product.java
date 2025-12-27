// Attributes: productName (String), price (double), and a static attribute totalProducts (int) to keep track of the total number of products created.
// Constructor: A parameterized constructor to initialize productName and price. Increment totalProducts each time a new product is created.
// Methods: An instance method displayProductDetails() to print the product's details, and a class method displayTotalProducts() to print the total number of products created.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹ " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 75000.0);
        Product product2 = new Product("Smartphone", 25000.0);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}