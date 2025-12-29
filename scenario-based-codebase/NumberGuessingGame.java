import java.util.*;
public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		int attempts = 0;
		int maxAttempts = 5;
		int playerGuess = 0;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

		do {
			System.out.print("Enter your guess: ");
			playerGuess = scanner.nextInt();
			attempts++;

			if (playerGuess < numberToGuess) {
				System.out.println("Too low!");
			} else if (playerGuess > numberToGuess) {
				System.out.println("Too high!");
			} else {
				System.out.println("Congratulations! You've guessed the number " + numberToGuess);
				break;
			}

			if (attempts == maxAttempts) {
				System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
			}
		} while (attempts < maxAttempts);
		scanner.close();
	}
}
