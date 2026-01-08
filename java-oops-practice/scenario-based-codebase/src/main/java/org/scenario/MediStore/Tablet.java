package org.scenario.MediStore;

class Tablet extends Medicine {

    Tablet(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public boolean checkExpiry() {
        return expiryDate.compareTo("2026-01") < 0;
    }
}
