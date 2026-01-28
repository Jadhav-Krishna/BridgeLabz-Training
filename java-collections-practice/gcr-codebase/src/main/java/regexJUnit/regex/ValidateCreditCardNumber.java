package regexJUnit.regex;

public class ValidateCreditCardNumber {

	public static void main(String[] args) {
		String[] testCards = {"4111111111111111", "5111111111111111", "6111111111111111"};
		String cardPattern = "^(4[0-9]{15}|5[1-5][0-9]{14})$";
		for (String card : testCards) {
			if (card.matches(cardPattern)) {
				System.out.println(card + " is a valid credit card number.");
			} else {
				System.out.println(card + " is not a valid credit card number.");
			}
		}
	}
}
