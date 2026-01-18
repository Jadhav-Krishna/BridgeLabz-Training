package org.scenario.PayXpress;

class InternetBill extends Bill implements IPayable {
    InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }
    public void pay() {
        markAsPaid();
        System.out.println("Internet bill paid");
    }
    public void sendReminder() {
        System.out.println("Internet bill due – avoid disconnection");
    }
}
