package exceptionHandling;
import java.util.*;
import java.io.*;

public class CustomException {
	
	static class InvalidAgeException extends Exception {
		private static final long serialVersionUID = 1L;
		public InvalidAgeException(String message) {
			super(message);
		}
	}
	
	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("age: ");
		int age = scanner.nextInt();
		try {
			validateAge(age);
			System.out.println("Access granted!");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}

	}
}
