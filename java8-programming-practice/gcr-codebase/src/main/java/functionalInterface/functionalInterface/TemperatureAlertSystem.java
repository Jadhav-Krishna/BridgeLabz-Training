package functionalInterface.functionalInterface;
import java.util.LinkedList;

public class TemperatureAlertSystem {
    interface TemperatureAlert {
        boolean isTemperatureHigh(Double temperature);
    }

    static class TemperatureMonitor {
        private final TemperatureAlert alertCondition;
        private final double threshold;

        TemperatureMonitor(TemperatureAlert alertCondition, double threshold) {
            this.alertCondition = alertCondition;
            this.threshold = threshold;
        }

        void checkTemperature(Double temperature) {
            if (alertCondition.isTemperatureHigh(temperature)) {
                System.out.println("ALERT: Temperature " + temperature + "°C exceeds threshold of " + threshold + "°C!");
            } else {
                System.out.println("Temperature " + temperature + "°C is within safe limits.");
            }
        }
    }

    public static void main(String[] args) {
        double threshold = 30.0;

        TemperatureAlert highTempAlert = temp -> temp > threshold;

        TemperatureMonitor monitor = new TemperatureMonitor(highTempAlert, threshold);

        LinkedList<Double> temperatureReadings = new LinkedList<>();
        temperatureReadings.add(28.5);
        temperatureReadings.add(31.2);
        temperatureReadings.add(29.8);
        temperatureReadings.add(35.0);
        temperatureReadings.add(27.3);

        for (Double temp : temperatureReadings) {
            monitor.checkTemperature(temp);
        }
    }
}
