import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class LibraryReminder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print(i+" book return date (yyyy-MM-dd) : ");
			LocalDate date1 = LocalDate.parse(sc.next());
			System.out.print(i+" book due date (yyyy-MM-dd) : ");
			LocalDate date2 = LocalDate.parse(sc.next());
			
			long daysLate = ChronoUnit.DAYS.between(date2, date1);
			if (daysLate > 0) {
			    int fine = (int) (daysLate * 5);
			    System.out.println("Total fine is : " + fine);
			} else {
			    System.out.println("No fine");
			}
		}
		sc.close();
	}
}
