package multiThreading.threadStateMonitoringSystem;

public class TaskRunner extends Thread {
    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        compute();
        sleepMillis(2000);
        compute();
    }

    private void compute() {
        long sum = 0;
        for (int i = 0; i < 5_000_000; i++) {
            sum += i;
        }
        if (sum == -1) {
            System.out.println("");
        }
    }

    private void sleepMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
