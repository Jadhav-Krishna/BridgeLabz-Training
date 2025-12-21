import java.util.*;

public class LeapYear {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " leap year");
        } else {
            System.out.println(year + " not leap year");
        }
    }
    // check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582 == false) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}