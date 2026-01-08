package org.scenario.MediStore;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine m1 = new Tablet("Paracetamol", 20, "2026-05");
        Medicine m2 = new Syrup("Cough Syrup", 120, "2025-04");

        System.out.println("Bill Amount = " + m1.sell(30));
        System.out.println("Tablet Expired? " + m1.checkExpiry());

        System.out.println("Bill Amount = " + m2.sell(5));
        System.out.println("Syrup Expired? " + m2.checkExpiry());
    }
}
