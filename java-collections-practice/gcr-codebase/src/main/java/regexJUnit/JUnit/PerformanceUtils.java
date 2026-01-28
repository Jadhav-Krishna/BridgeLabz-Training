package regexJUnit.JUnit;

public class PerformanceUtils {

    public static String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "DONE";
    }
}
