import java.util.*;

class LowercaseCompare {

    public static String lowercaseCompare(String str) {
        return str.toLowerCase();
    }

    public static String lowercaseCompareManual(String str) {
        char[] temp = str.toCharArray();
	String tempString = "";
        for (int i = 0; i < str.length(); i++) {
            temp[i] = (char)(temp[i]+32);
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
        System.out.print(comparison(lowercaseCompareManual(str),lowercaseCompare(str)));
    }
}
