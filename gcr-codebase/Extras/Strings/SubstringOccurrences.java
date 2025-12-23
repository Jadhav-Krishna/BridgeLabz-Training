import java.util.*;
// count how many times a given substring occurs in a string.
public class SubstringOccurrences {
    public static int countSubstringOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine();
        System.out.print("substring: ");
        String substring = scanner.nextLine();
        System.out.println("occurrences: " + countSubstringOccurrences(input, substring));

        scanner.close();
    }
}
