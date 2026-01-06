package org.scenario.EduMentor;

public class EduMentorApp {
	public static void main(String[] args) {
		Instructor fullTimeInstructor = new Instructor("Dr. Sharma", "sharma@example.com", 101, CourseType.FULL_TIME);
		Course javaCourse = new Course("Java Programming", CourseType.FULL_TIME);

		Learner learner = new Learner("Shna", "shna@example.com", 201);
		learner.enrollInCourse(javaCourse);

		String[] questions = {
			"Capital of France?\nA) Berlin\nB) Madrid\nC) Paris\nD) Rome",
			"Largest ocean on Earth?\nA) Atlantic Ocean\nB) Indian Ocean\nC) Arctic Ocean\nD) Pacific Ocean",
			"Red Planet?\nA) Earth\nB) Mars\nC) Jupiter\nD) Saturn"
		};

		char[] answers = { 'C', 'D', 'B' };

		Quiz quiz = new Quiz(questions, answers);
		quiz.start();

		fullTimeInstructor.generateCertificate();
	}
}

