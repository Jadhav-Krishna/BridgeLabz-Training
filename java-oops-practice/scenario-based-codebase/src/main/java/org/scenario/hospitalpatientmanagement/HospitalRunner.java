package org.scenario.hospitalpatientmanagement;

public class HospitalRunner {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1, "Anuj", 32, "Piles", "AIDS", 69, 21);
        OutPatient outPatient = new OutPatient(2, "Muskan", 45, "Brain Flu", "Allergic to curd", "2026-01-02");

        System.out.println("-- InPatient Info --");
        inPatient.displayInfo();
        System.out.println();
        inPatient.getSummary();
        System.out.println("\n\n-- OutPatient Info --");
        outPatient.displayInfo();
        System.out.println();
        outPatient.getSummary();

        Bill bill = new Bill(10000, 18, 10);
        int total = bill.calculatePayment();
        System.out.println("\n\nTotal bill amount: " + total);
    }
}

