package org.scenario.HomeNest;

class Lock extends Device implements IControllable {

    Lock(String id) {
        super(id, 2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Door Locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door Unlocked");
    }

    public void reset() {
        System.out.println("Lock reset & security re-enabled");
    }
}
