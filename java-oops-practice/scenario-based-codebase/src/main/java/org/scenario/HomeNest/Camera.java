package org.scenario.HomeNest;

class Camera extends Device implements IControllable {

    Camera(String id) {
        super(id, 10);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera stopped");
    }

    public void reset() {
        System.out.println("Camera reset & recalibrated");
    }
}
