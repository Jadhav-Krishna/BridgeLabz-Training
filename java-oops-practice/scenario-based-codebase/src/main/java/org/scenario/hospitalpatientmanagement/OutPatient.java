package org.scenario.hospitalpatientmanagement;

public class OutPatient extends Patient {
    private String visitDate;

    public OutPatient(int patientId, String name, int age, String disease, String medicalHistory,
                      String visitDate) {
        super(patientId, name, age, disease, medicalHistory);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" visit date : " + visitDate);
    }
}
