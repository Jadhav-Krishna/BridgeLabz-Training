package multiThreading.restaurantOrderProcessingSystem;

public class Chef extends Thread {
    private final String dish;
    private final long totalMillis;

    public Chef(String name, String dish, long totalMillis) {
        super(name);
        this.dish = dish;
        this.totalMillis = totalMillis;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);
        long step = totalMillis / 4;
        int progress = 25;
        for (int i = 0; i < 4; i++) {
            sleepStep(step);
            System.out.println(getName() + " preparing " + dish + ": " + progress + "% complete");
            progress += 25;
        }
    }

    private void sleepStep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
