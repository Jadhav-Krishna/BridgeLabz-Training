package streams;
import java.io.*;
public class BufferedStreams {

	public static void main(String[] args) {
		String sourceFile = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source.txt";
		String bufferedDestinationFile = "buffered_copy.txt";
		String unbufferedDestinationFile = "unbuffered_copy.txt";

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
			 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedDestinationFile))) {

			byte[] buffer = new byte[4096];
			int bytesRead;
			long startTime = System.nanoTime();

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

			long endTime = System.nanoTime();
			System.out.println("Buffered copy completed in " + (endTime - startTime) + " nanoseconds.");
		} catch (IOException e) {
			System.out.println("error occurred with buffered streams: " + e.getMessage());
		}

		try (FileInputStream fis = new FileInputStream(sourceFile);
			 FileOutputStream fos = new FileOutputStream(unbufferedDestinationFile)) {

			byte[] buffer = new byte[4096];
			int bytesRead;
			long startTime = System.nanoTime();

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

			long endTime = System.nanoTime();
			System.out.println("Unbuffered copy completed in " + (endTime - startTime) + " nanoseconds.");
		} catch (IOException e) {
			System.out.println("error occurred with unbuffered streams: " + e.getMessage());
		}

	}

}
