package org.scenario.MediStore;

class Syrup extends Medicine {

    Syrup(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public boolean checkExpiry() {
        return expiryDate.compareTo("2025-06") < 0;
    }
}

