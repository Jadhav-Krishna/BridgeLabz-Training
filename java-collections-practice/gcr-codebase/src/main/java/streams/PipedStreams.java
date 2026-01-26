package streams;
import java.io.*;

public class PipedStreams {

	public static void main(String[] args) {
		try {
			PipedOutputStream pipedOutputStream = new PipedOutputStream();
			PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

			Thread writerThread = new Thread(() -> {
				try {
					String data = "Hello from Piped Streams!";
					pipedOutputStream.write(data.getBytes());
					pipedOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			Thread readerThread = new Thread(() -> {
				try {
					byte[] buffer = new byte[1024];
					int bytesRead = pipedInputStream.read(buffer);
					String receivedData = new String(buffer, 0, bytesRead);
					System.out.println("Received Data: " + receivedData);
					pipedInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			writerThread.start();
			readerThread.start();

			writerThread.join();
			readerThread.join();

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
}
