package regexJUnit.regex;
import java.util.regex.*;
import java.util.*;

public class CensorBadWords {

	public static void main(String[] args) {
		String text = "This is a badword1 and another badword2 in the text.";
		String[] badWords = {"badword1", "badword2"};
		
		for (String badWord : badWords) {
			String regex = "\\b" + Pattern.quote(badWord) + "\\b";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(text);
			String replacement = "*".repeat(badWord.length());
			text = matcher.replaceAll(replacement);
		}
		
		System.out.println(text);
	}
}
