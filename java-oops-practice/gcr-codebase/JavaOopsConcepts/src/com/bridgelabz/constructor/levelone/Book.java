// Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "2 states";
        this.author = "Chetan Bhagat";
        this.price = 170.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹ " + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayDetails();
        System.out.println();
        Book paramBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        paramBook.displayDetails();
    }
}