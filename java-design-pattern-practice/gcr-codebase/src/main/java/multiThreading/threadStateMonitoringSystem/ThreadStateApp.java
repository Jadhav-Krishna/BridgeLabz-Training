package multiThreading.threadStateMonitoringSystem;

public class ThreadStateApp {
    public static void main(String[] args) throws InterruptedException {
        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(new Thread[]{t1, t2});
        monitor.start();

        Thread.sleep(200);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        monitor.join();
    }
}
