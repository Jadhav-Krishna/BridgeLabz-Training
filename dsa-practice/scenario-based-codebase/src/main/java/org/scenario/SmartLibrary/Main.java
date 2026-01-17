package org.scenario.SmartLibrary;

public class Main {
    public static void main(String[] args) {
        String[] borrowedBooks = {
            "Algorithms",
            "Data Structures",
            "Java Basics",
            "Operating Systems"
        };
        SmartLibrary lib = new SmartLibrary();
        lib.insertionSort(borrowedBooks);
        for (String b : borrowedBooks) {
            System.out.println(b);
        }
    }
}
