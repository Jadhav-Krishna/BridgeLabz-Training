import java.util.*;

// Convert uppercase letters to lowercase and vice versa.
public class CaseCharacters {
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine();
        System.out.println("toggled case: " + toggleCase(input));

        scanner.close();
    }
}
