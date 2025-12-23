import java.util.*;
// remove all duplicate characters
public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine();
        String modifiedString = removeDuplicates(input);
        System.out.println("removing duplicates: " + modifiedString);

        scanner.close();
    }
}
