package org.scenario.smartHomeAutomation;

public class SmartHomeApp {

    public static void main(String[] args) {

        Light light = new Light("Kitchen");
        Fan fan = new Fan("Bedroom");
        AC ac = new AC("Hall");

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        controller.compareEnergyUsage(ac, fan);

        controller.controlDevice(ac, false);
    }
}
