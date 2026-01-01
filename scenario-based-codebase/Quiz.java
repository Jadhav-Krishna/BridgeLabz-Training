import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = {
                "capital of France?\nA) Berlin\nB) Madrid\nC) Paris\nD) Rome",
                "largest ocean on Earth?\nA) Atlantic Ocean\nB) Indian Ocean\nC) Arctic Ocean\nD) Pacific Ocean",
                "Red Planet?\nA) Earth\nB) Mars\nC) Jupiter\nD) Saturn",
                "chemical symbol for water?\nA) CO2\nB) H2O\nC) O2\nD) NaCl",
                "Who wrote 'Romeo and Juliet'?\nA) Charles Dickens\nB) William Shakespeare\nC) Mark Twain\nD) Jane Austen",
        };

        char[] answers = { 'C', 'D', 'B', 'B', 'B' };
        char[] userAnswers = new char[5];
        int score = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("answer: ");
            userAnswers[i] = sc.next().toUpperCase().charAt(0);

            switch (userAnswers[i]) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswers[i] == answers[i]) {
                        score++;
                    }
                    break;
                default:
                    System.out.println("Invalid answer");
            }
        }

        System.out.println("total score : " + score + " out of " + questions.length);
        sc.close();
    }

}