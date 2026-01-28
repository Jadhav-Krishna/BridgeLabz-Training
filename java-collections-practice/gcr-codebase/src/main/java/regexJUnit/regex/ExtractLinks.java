package regexJUnit.regex;
import java.util.*;
import java.util.regex.*;

public class ExtractLinks {

	public static void main(String[] args) {
		String text = "Visit https://www.google.com and http://example.org for more info.";
		String regex = "\\bhttps?://[\\w.-]+(?:/\\S*)?\\b";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		List<String> links = new ArrayList<>();

		while (matcher.find()) {
			links.add(matcher.group());
		}

		System.out.println(String.join(", ", links));

	}

}
