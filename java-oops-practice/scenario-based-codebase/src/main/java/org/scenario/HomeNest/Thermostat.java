package org.scenario.HomeNest;

class Thermostat extends Device implements IControllable {

    Thermostat(String id) {
        super(id, 15);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Temperature reset to 24°C");
    }
}
