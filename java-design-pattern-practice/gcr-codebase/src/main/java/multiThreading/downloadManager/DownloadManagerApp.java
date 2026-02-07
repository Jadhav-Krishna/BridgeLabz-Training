package multiThreading.downloadManager;

public class DownloadManagerApp {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new FileDownloaderThread("Document.pdf");
        Thread t2 = new FileDownloaderThread("Image.jpg");
        Thread t3 = new FileDownloaderThread("Video.mp4");

        Thread r1 = new Thread(new FileDownloaderRunnable("Document.pdf"));
        Thread r2 = new Thread(new FileDownloaderRunnable("Image.jpg"));
        Thread r3 = new Thread(new FileDownloaderRunnable("Video.mp4"));

        t1.start();
        t2.start();
        t3.start();

        r1.start();
        r2.start();
        r3.start();

        t1.join();
        t2.join();
        t3.join();
        r1.join();
        r2.join();
        r3.join();

        System.out.println("All downloads complete!");
    }
}
