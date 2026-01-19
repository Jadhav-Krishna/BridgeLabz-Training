package org.scenario.HomeNest;

class Light extends Device implements IControllable {

    Light(String id) {
        super(id, 5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light reset to default brightness");
    }
}
