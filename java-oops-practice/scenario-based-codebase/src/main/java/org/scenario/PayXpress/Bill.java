package org.scenario.PayXpress;

class Bill {
    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;
    Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }
    double calculateLateFee(double penalty) {
        return amount + penalty;
    }
    protected void markAsPaid() {
        isPaid = true;
    }
    public boolean isPaid() {
        return isPaid;
    }
}

