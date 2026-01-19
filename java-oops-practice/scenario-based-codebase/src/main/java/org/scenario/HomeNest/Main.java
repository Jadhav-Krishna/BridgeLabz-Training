package org.scenario.HomeNest;

public class Main {
    public static void main(String[] args) {

        IControllable[] devices = {
            new Light("L1"),
            new Camera("C1"),
            new Thermostat("T1"),
            new Lock("D1")
        };

        for (IControllable d : devices) {
            d.turnOn();
            d.reset();
            d.turnOff();
        }
    }
}
