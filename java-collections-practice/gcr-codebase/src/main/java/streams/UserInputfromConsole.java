package streams;
import java.io.*;

public class UserInputfromConsole {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String filePath = "user_info.txt";

		try {
			System.out.print("name: ");
			String name = reader.readLine();

			System.out.print("age: ");
			String age = reader.readLine();

			System.out.print("favorite programming language: ");
			String language = reader.readLine();

			try (FileWriter writer = new FileWriter(filePath)) {
				writer.write("Name: " + name + "\n");
				writer.write("Age: " + age + "\n");
				writer.write("favorite programming language: " + language + "\n");
				System.out.println("User information saved to " + filePath);
			} catch (IOException e) {
				System.out.println("error writing to file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("error reading input: " + e.getMessage());
		}

	}

}
