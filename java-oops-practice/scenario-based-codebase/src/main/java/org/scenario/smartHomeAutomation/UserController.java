package org.scenario.smartHomeAutomation;

public class UserController {
    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergyUsage(Appliance d1, Appliance d2) {
        if (d1.getPowerConsuption() > d2.getPowerConsuption()) {
            System.out.println(d1.deviceName + " consumes more energy than " + d2.deviceName);
        } else if (d1.getPowerConsuption() < d2.getPowerConsuption()) {
            System.out.println(d2.deviceName + " consumes more energy than " + d1.deviceName);
        } else {
            System.out.println("Both devices consume equal energy");
        }
    }
}
