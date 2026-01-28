package regexJUnit.regex;
import java.util.regex.*;
import java.util.*;

public class ReplaceMspaceToSspace {

	public static void main(String[] args) {
		String text = "This   is  an    example   with   multiple    spaces.";
		String regex = "\\s+";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		String result = matcher.replaceAll(" ");

		System.out.println(result);

	}
}
