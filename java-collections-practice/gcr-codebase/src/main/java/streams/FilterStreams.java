package streams;
import java.io.*;

public class FilterStreams {

	public static void main(String[] args) {
		String sourceFile = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source.txt";
		String destinationFile = "lowercase_output.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line.toLowerCase());
				bw.newLine();
			}
			System.out.println("File converted to lowercase and saved to " + destinationFile);
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		}
	}
}
