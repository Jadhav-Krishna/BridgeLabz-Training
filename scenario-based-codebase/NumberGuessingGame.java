import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("guess a number between 1 and 100 : ");
		int number = sc.nextInt();
		int count = 0;
		do {
			System.out.print("guess a number between 1 and 100 : ");
		}while(count >= 5);
	}
}
