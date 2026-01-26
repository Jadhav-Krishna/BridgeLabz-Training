package streams;
import java.io.*;

public class ByteArrayStream {

	public static void main(String[] args) {
		String sourceImagePath = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source_image.jpg";
		String destinationImagePath = "copied_image.jpg"; //

		try {
			FileInputStream fis = new FileInputStream(sourceImagePath);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}
			fis.close();

			byte[] imageBytes = baos.toByteArray();
			baos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
			FileOutputStream fos = new FileOutputStream(destinationImagePath);

			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
			bais.close();
			fos.close();

			System.out.println("Image copied successfully to " + destinationImagePath);

		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		}

	}

}
