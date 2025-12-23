// count the number of vowels and consonants in a given string.

import java.util.*;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("vowels: " + vowelCount);
        System.out.println("consonants: " + consonantCount);

        scanner.close();
    }

}
