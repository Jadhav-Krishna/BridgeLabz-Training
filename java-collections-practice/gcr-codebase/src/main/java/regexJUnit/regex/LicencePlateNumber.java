package regexJUnit.regex;

public class LicencePlateNumber {
	public static boolean isValidLicencePlate(String plate) {
		String regex = "^[A-Z]{2}\\d{4}$";
		return plate.matches(regex);
	}

	public static void main(String[] args) {
		String[] testPlates = { "AB1234", "A12345", "XY9876", "abc123", "ZZ0000", "A1B2C3" };

		for (String plate : testPlates) {
			System.out.println(plate + " → " + (isValidLicencePlate(plate) ? "Valid" : "Invalid"));
		}
	}
}
