// Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
import java.util.*;
package com.bridgelabz.constructor.levelone;
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // By default, the book is available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned: " + title);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹ " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", 15.0);
        book1.displayDetails();
        System.out.println();

        book1.borrowBook();
        book1.displayDetails();
        System.out.println();

        book1.returnBook();
        book1.displayDetails();
    }
}