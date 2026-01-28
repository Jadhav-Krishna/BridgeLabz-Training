package regexJUnit.regex;
import java.util.regex.*;
import java.util.*;

public class ValidateSocialSecurityNo {

	public static void main(String[] args) {
		String[] testSSNs = {"123-45-6789", "123456789", "987-65-4320", "12-345-6789"};
		String ssnPattern = "^(\\d{3}-\\d{2}-\\d{4})$";
		for (String ssn : testSSNs) {
			if (ssn.matches(ssnPattern)) {
				System.out.println(ssn + " is valid.");
			} else {
				System.out.println(ssn + " is invalid.");
			}
		}	
	}
}
