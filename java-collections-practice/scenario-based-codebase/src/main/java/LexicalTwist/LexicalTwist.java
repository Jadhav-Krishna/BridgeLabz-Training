package LexicalTwist;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LexicalTwist {

    static boolean reverseCheck(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int n = str1.length();
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (str1.charAt(i) != str2.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder replaceVowel(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.setCharAt(i, '@');
            }
        }
        return sb;
    }

    static int[] countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        int[] arr = new int[2];

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toUpperCase(str.charAt(i));

            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels++;
            } else {
                consonants++;
            }
        }

        arr[0] = vowels;
        arr[1] = consonants;
        return arr;
    }

    static void printFirstTwoVowels(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                set.add(c);
                if (set.size() == 2) break;
            }
        }

        for (char c : set) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void printFirstTwoConsonants(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                set.add(c);
                if (set.size() == 2) break;
            }
        }

        for (char c : set) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the Second word : ");
        String str2 = sc.nextLine();

        if (str1.contains(" ")) {
            System.out.println(str1 + " is an invalid word");
            return;
        }

        if (str2.contains(" ")) {
            System.out.println(str2 + " is an invalid word");
            return;
        }

        if (reverseCheck(str1.toLowerCase(), str2.toLowerCase())) {

            System.out.println(replaceVowel(str1.toLowerCase()));

        } else {

            // If not reverse
            String str = (str1 + str2).toUpperCase();
            int[] arr = countVowelsConsonants(str);

            if (arr[0] > arr[1]) {
                printFirstTwoVowels(str);
            } 
            else if (arr[0] < arr[1]) {
                printFirstTwoConsonants(str);
            } 
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
