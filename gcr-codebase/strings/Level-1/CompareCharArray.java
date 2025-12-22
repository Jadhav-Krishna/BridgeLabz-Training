import java.util.*;

class CompareCharArray {

    public static char[] charToArray(String str) {
        return str.toCharArray();
    }

    public static char[] charToArrayManual(String str) {
        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(i);
        }
	System.out.print(Arrays.toString(temp));
        return temp;
    }

    public static boolean comparison(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(comparison(charToArray(str),charToArrayManual(str)));
    }
}
