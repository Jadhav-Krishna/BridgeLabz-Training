package org.scenario.PayXpress;

class ElectricityBill extends Bill implements IPayable {
    ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }
    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid");
    }
    public void sendReminder() {
        System.out.println("Electricity bill due soon");
    }
}
