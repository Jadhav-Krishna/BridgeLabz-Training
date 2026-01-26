package streams;
import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
		String sourceFile = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source.txt";
		String destinationFile = "destination.txt";

		try (FileInputStream fis = new FileInputStream(sourceFile);
			 FileOutputStream fos = new FileOutputStream(destinationFile)) {

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

			System.out.println("File copied successfully!");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		

	}

}
