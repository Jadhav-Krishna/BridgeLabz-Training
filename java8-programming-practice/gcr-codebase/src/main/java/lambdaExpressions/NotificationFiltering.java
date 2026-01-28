package lambdaExpressions;
import java.util.*;

public class NotificationFiltering {
    static class Alert {
        String type;
        String message;
        String severity;

        Alert(String type, String message, String severity) {
            this.type = type;
            this.message = message;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return "Alert{" + "type='" + type + '\'' + ", message='" + message + '\'' + ", severity='" + severity + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Medication", "Time to take your medication", "High"),
                new Alert("Appointment", "Upcoming appointment tomorrow", "Medium"),
                new Alert("General", "Stay hydrated!", "Low"),
                new Alert("Medication", "Refill your prescription", "Medium")
        );

        System.out.println("High Severity Alerts:");
        filterAlerts(alerts, alert -> "High".equals(alert.severity));

        System.out.println("\nMedication Alerts:");
        filterAlerts(alerts, alert -> "Medication".equals(alert.type));
    }

    private static void filterAlerts(List<Alert> alerts, java.util.function.Predicate<Alert> predicate) {
        for (Alert alert : alerts) {
            if (predicate.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}
