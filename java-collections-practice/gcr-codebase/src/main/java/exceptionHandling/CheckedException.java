package exceptionHandling;
import java.util.*;
import java.io.*;

public class CheckedException {
	public static void main(String[] args) {
		try {
			Scanner fileScanner = new Scanner(new File("data.txt"));
			while (fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (java.io.IOException e) {
			System.out.println("File not found");
		}
	}
}
