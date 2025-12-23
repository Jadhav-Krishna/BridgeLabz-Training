import java.util.*;
// compare two strings lexicographically (dictionary order) without using built-in compare methods.
public class CompareStrings {
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            if (char1 != char2) {
                return char1 - char2;
            }
        }
        return len1 - len2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string 1: ");
        String input1 = scanner.nextLine();
        System.out.print("string 2: ");
        String input2 = scanner.nextLine();
        int result = compareStrings(input1, input2);
        if (result < 0) {
            System.out.println("\"" + input1 + "\" is less than \"" + input2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + input1 + "\" is greater than \"" + input2 + "\"");
        } else {
            System.out.println("Both are equal.");
        }

        scanner.close();
    }
}
