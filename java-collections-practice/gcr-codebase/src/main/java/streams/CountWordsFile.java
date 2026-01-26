package streams;
import java.io.*;
import java.util.*;

public class CountWordsFile {

	public static void main(String[] args) {
		String filePath = "D:\\BridgeLabz-Training\\java-collections-practice\\gcr-codebase\\src\\main\\java\\streams\\source.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			HashMap<String, Integer> wordCountMap = new HashMap<>();

			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\W+");
				for (String word : words) {
					if (!word.isEmpty()) {
						word = word.toLowerCase();
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}

			List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
			sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

			System.out.println("Top 5 most frequently occurring words:");
			for (int i = 0; i < Math.min(5, sortedEntries.size()); i++) {
				Map.Entry<String, Integer> entry = sortedEntries.get(i);
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
