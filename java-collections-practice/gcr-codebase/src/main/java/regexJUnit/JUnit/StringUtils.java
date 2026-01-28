package regexJUnit.JUnit;

public class StringUtils {

    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        String rev = reverse(clean);
        return clean.equals(rev);
    }

    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
