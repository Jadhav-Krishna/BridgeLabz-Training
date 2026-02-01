package collectors.wordFrequencyCounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		String paragraph = "java is easy and java is powerful";

		Map<String, Integer> wordCount = Arrays.stream(paragraph.split("\\s+")).collect(Collectors.toMap(word -> word,word -> 1,Integer::sum));

		System.out.println(wordCount);

	}

}
