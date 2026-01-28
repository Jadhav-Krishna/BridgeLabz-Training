package regexJUnit.regex;
import java.util.regex.*;
import java.util.*;

public class ExtractProgrammingLanguageNames {

	public static void main(String[] args) {
		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		 String regex = "\\b(Java|Python|JavaScript|C\\+\\+|Ruby|Go|Swift|Kotlin)\\b";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(text);
		 List<String> languages = new ArrayList<>();
		 while (matcher.find()) {
			 languages.add(matcher.group());
		 }
		 System.out.println(String.join(", ", languages));
		 
	}

}
