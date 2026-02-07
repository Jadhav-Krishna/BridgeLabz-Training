package multiThreading.printShopJobScheduler;

public class PrintJob implements Runnable {
    private final String jobName;
    private final int pages;
    private final int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        for (int page = 1; page <= pages; page++) {
            System.out.println("[" + priorityLabel() + "] Printing " + jobName + " - Page " + page + " of " + pages);
            sleepMillis(100);
        }
    }

    private String priorityLabel() {
        if (priority >= 7) {
            return "High Priority";
        }
        if (priority >= 5) {
            return "Medium Priority";
        }
        return "Low Priority";
    }

    private void sleepMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
