import java.util.*;

class SubStringComparison {

    public static String subString(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static String subStringCharAt(String str, int start, int end) {
        String temp = "";
        for (int i = start; i < end; i++) {
            temp += str.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        if (subString(str, start, end)
                .equals(subStringCharAt(str, start, end))) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
