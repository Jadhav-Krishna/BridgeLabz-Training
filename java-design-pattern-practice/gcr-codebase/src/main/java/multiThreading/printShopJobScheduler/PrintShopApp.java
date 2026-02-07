package multiThreading.printShopJobScheduler;

public class PrintShopApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting print jobs...");
        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[5];
        threads[0] = createThread("Job1", 10, 5);
        threads[1] = createThread("Job2", 5, 8);
        threads[2] = createThread("Job3", 15, 3);
        threads[3] = createThread("Job4", 8, 6);
        threads[4] = createThread("Job5", 12, 7);

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long total = System.currentTimeMillis() - start;
        System.out.println("All jobs completed in " + total + "ms");
    }

    private static Thread createThread(String jobName, int pages, int priority) {
        Thread thread = new Thread(new PrintJob(jobName, pages, priority), jobName);
        thread.setPriority(mapPriority(priority));
        return thread;
    }

    private static int mapPriority(int priority) {
        if (priority >= 8) {
            return Thread.MAX_PRIORITY;
        }
        if (priority >= 6) {
            return Thread.NORM_PRIORITY + 1;
        }
        if (priority >= 5) {
            return Thread.NORM_PRIORITY;
        }
        return Thread.MIN_PRIORITY + 1;
    }
}
