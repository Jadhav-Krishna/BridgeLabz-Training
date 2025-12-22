import java.util.*;

class UppercaseCompare {

    public static String uppercaseCompare(String str) {
        return str.toUpperCase();
    }

    public static String uppercaseCompareManual(String str) {
        char[] temp = str.toCharArray();
	String tempString = "";
        for (int i = 0; i < str.length(); i++) {
            temp[i] = (char)(temp[i]-32);
	    tempString += temp[i];
        }
        return tempString;
    }

    public static boolean comparison(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        System.out.print(comparison(uppercaseCompareManual(str),uppercaseCompare(str)));
    }
}
