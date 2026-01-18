package org.scenario.PayXpress;

class WaterBill extends Bill implements IPayable {
    WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid");
    }
    public void sendReminder() {
        System.out.println("Water bill due – save water");
    }
}
