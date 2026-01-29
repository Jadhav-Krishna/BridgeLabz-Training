package functionalInterface.implementingInterfaces;

public class SmartDeviceControlInterface {
    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    static class SmartLight implements SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart Light is turned ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Smart Light is turned OFF");
        }
    }

    static class SmartAC implements SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart AC is turned ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Smart AC is turned OFF");
        }
    }

    static class SmartTV implements SmartDevice {
        @Override
        public void turnOn() {
            System.out.println("Smart TV is turned ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Smart TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice ac = new SmartAC();
        SmartDevice tv = new SmartTV();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}
