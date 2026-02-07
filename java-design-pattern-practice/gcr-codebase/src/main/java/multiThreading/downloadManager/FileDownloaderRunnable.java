package multiThreading.downloadManager;

import java.util.concurrent.ThreadLocalRandom;

public class FileDownloaderRunnable implements Runnable {
    private final String fileName;

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + progress + "%");
            sleepRandom();
        }
    }

    private void sleepRandom() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(200, 700));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
