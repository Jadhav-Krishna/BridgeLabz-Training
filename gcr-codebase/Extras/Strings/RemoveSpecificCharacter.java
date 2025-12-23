import java.util.*;
// remove all occurrences of a specific character from a string.

public class RemoveSpecificCharacter {
    public static String removeCharacter(String input, char charToRemove) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != charToRemove) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine();
        System.out.print("to remove: ");
        char charToRemove = scanner.nextLine().charAt(0);
        String result = removeCharacter(input, charToRemove);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
