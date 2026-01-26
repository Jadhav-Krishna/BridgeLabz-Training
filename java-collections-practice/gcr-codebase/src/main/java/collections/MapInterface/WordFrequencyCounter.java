package collections.MapInterface;
import java.util.*;
public class WordFrequencyCounter {

	public static void main(String[] args) {
		String text = "hello world hello java";
		String[] words = text.split(" ");

		Map<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		System.out.println(wordCountMap);
	}
}
