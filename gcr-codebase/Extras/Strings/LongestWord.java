import java.util.*;
// takes a sentence as input and returns the longest word
public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string : ");
        String input = scanner.nextLine();
        String longestWord = findLongestWord(input);
        System.out.println("longest word : " + longestWord);

        scanner.close();
    }
}
