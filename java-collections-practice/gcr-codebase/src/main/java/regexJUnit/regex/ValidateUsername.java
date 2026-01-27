package regexJUnit.regex;
import java.util.regex.Pattern;

public class ValidateUsername {
	public static boolean isValidUsername(String username) {
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		return username.matches(regex);
	}

	public static void main(String[] args) {
		String[] testUsernames = { "user_123", "123user", "us", "validUser_1", "user!name", "a_very_long_username" };

		for (String username : testUsernames) {
			System.out.println(username + " → " + (isValidUsername(username) ? "Valid" : "Invalid"));
		}

	}

}
