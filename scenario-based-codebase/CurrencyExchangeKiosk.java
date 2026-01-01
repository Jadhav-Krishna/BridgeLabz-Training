import java.util.*;
public class CurrencyExchangeKiosk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount : ");
		int inr = sc.nextInt();
		System.out.print("Enter the currency you wanna transfer (USD , EUR, GBP, JPY): ");

		String currency = sc.next().toUpperCase();
		double convertedAmount = 0.0;
		switch (currency) {
		case "USD":
			convertedAmount = inr * 0.013;
			System.out.println("Converted Amount in USD: " + convertedAmount);
			break;
		case "EUR":
			convertedAmount = inr * 0.012;
			System.out.println("Converted Amount in EUR: " + convertedAmount);
			break;
		case "GBP":
			convertedAmount = inr * 0.011;
			System.out.println("Converted Amount in GBP: " + convertedAmount);
			break;
		case "JPY":
			convertedAmount = inr * 1.51;
			System.out.println("Converted Amount in JPY: " + convertedAmount);
			break;
		case "AUD":
			convertedAmount = inr * 0.018;
			System.out.println("Converted Amount in AUD: " + convertedAmount);
			break;
		default:
			System.out.println("Invalid Currency");
			break;
		}
		sc.close();
	}
}
