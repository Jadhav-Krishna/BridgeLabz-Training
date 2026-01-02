package org.scenario.hospitalpatientmanagement;

public class InPatient extends Patient {
    private int wardNumber;
    private int stayDays;

    public InPatient(int patientId, String name, int age, String disease, String medicalHistory,
                     int wardNumber, int stayDays) {
        super(patientId, name, age, disease, medicalHistory);
        this.wardNumber = wardNumber;
        this.stayDays = stayDays;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" ward number : " + wardNumber);
        System.out.print(" stay days : " + stayDays);
    }
}
