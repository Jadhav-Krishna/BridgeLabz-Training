package org.scenario.MediStore;

class Injection extends Medicine {

    Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public boolean checkExpiry() {
        return expiryDate.compareTo("2025-03") < 0;
    }
}
