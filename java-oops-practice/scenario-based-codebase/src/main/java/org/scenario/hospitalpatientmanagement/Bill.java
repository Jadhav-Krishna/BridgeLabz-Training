package org.scenario.hospitalpatientmanagement;

public class Bill implements Payable {
    private int baseAmount;
    private int tax;
    private int discount;
    private int totalAmount;

    public Bill(int baseAmount, int tax, int discount) {
        this.baseAmount = baseAmount;
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public int calculatePayment() {
        int discountedAmount = baseAmount - (baseAmount * discount) / 100;
        int taxAmount = (discountedAmount * tax) / 100;
        this.totalAmount = discountedAmount + taxAmount;
        return totalAmount;
    }
}
