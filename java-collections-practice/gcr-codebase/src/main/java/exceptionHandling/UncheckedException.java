package exceptionHandling;
import java.util.*;
import java.io.*;

public class UncheckedException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("numerator: ");
			int numerator = scanner.nextInt();
			System.out.print("denominator: ");
			int denominator = scanner.nextInt();
			int result = numerator / denominator;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} catch (InputMismatchException e) {
			System.out.println("Error: Please enter valid numeric values.");
		} finally {
			scanner.close();
		}

	}

}
