package org.scenario.ExamProctor;

public class Main {
    public static void main(String[] args) {
        ExamProctor exam = new ExamProctor();

        exam.correctAnswers.put(1, "A");
        exam.correctAnswers.put(2, "B");
        exam.correctAnswers.put(3, "C");

        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "C");

        int score = exam.calculateScore();
        System.out.println("Final Score: " + score);
    }
}
