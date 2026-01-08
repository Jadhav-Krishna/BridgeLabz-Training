package org.scenario.MediStore;

interface ISellable {
    double sell(int qty);
    boolean checkExpiry();
}
