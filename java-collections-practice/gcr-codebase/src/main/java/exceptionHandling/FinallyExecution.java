package exceptionHandling;
import java.util.*;

public class FinallyExecution {

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
		} finally {
			System.out.println("Operation completed");
			scanner.close();
		}

	}
}
