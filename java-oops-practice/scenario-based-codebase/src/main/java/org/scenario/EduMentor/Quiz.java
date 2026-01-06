package org.scenario.EduMentor;

import java.util.Scanner;

public class Quiz {

	private final String[] questions;
	private final char[] answers;
	private int score;

	public Quiz(String[] questions, char[] answers) {
		if (questions == null || answers == null || questions.length != answers.length) {
			throw new IllegalArgumentException("Questions and answers must be non-null and of same length");
		}
		this.questions = questions.clone();
		this.answers = answers.clone();
	}

	public void start() {
		try (Scanner sc = new Scanner(System.in)) {
			char[] userAnswers = new char[questions.length];
			for (int i = 0; i < questions.length; i++) {
				System.out.println(questions[i]);
				System.out.print("Answer: ");
				userAnswers[i] = Character.toUpperCase(sc.next().charAt(0));

				if (userAnswers[i] == 'A' || userAnswers[i] == 'B' || userAnswers[i] == 'C' || userAnswers[i] == 'D') {
					if (userAnswers[i] == answers[i]) {
						score++;
					}
				} else {
					System.out.println("Invalid answer");
				}
			}

			System.out.println("Total score: " + score + " out of " + questions.length);
			System.out.println("Percentage: " + calculatePercentage() + "%");
		}
	}

	public double calculatePercentage() {
		return (score * 100.0) / questions.length;
	}
}
