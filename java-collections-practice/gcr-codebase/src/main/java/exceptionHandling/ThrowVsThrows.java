package exceptionHandling;
import java.util.*;
import java.io.*;

public class ThrowVsThrows {
	static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount and rate must be positive");
		}
		return (amount * rate * years) / 100;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("amount: ");
		double amount = scanner.nextDouble();
		System.out.print("rate: ");
		double rate = scanner.nextDouble();
		System.out.print("years: ");
		int years = scanner.nextInt();
		try {
			double interest = calculateInterest(amount, rate, years);
			System.out.println("Calculated Interest: " + interest);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		} finally {
			scanner.close();
		}

	}
}
