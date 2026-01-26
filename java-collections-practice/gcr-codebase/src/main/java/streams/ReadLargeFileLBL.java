package streams;
import java.io.*;

public class ReadLargeFileLBL {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
