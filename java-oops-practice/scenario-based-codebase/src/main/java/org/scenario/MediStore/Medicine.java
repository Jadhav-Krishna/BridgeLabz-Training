package org.scenario.MediStore;

class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected String expiryDate;
    private int quantity;

    Medicine(String name, double price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = 50;
    }

    public int getQuantity() {
        return quantity;
    }

    private void updateStock(int qty) {
        quantity = quantity - qty;
    }

    private double calculateDiscount(double total) {
        if (total > 1000) {
            return total * 0.10;
        }
        return 0;
    }

    public double sell(int qty) {
        double total = price * qty;
        double discount = calculateDiscount(total);
        updateStock(qty);
        return total - discount;
    }

    public boolean checkExpiry() {
        return false;
    }
}
