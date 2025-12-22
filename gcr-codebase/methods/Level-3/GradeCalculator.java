import java.util.*;
// program to generate scorecard for students with grades and remarks
// Compute the total, average, and the percentage score
public class GradeCalculator {
    private static final Random RAND = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int numStudents = sc.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
// generate random scores for students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + RAND.nextInt(90);
            scores[i][1] = 10 + RAND.nextInt(90);
            scores[i][2] = 10 + RAND.nextInt(90);
        }
        return scores;
    }
// calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
// determine grade based on percentage
    private static String determineGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        if (percentage >= 70)
            return "B";
        if (percentage >= 60)
            return "C";
        if (percentage >= 50)
            return "D";
        if (percentage >= 40)
            return "E";
        return "R";
    }
// remarks based on grade
    private static String gradeRemarks(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, approaching agency-normalized standards";
            case "D":
                return "Level 1, below agency-normalized standards";
            case "E":
                return "Level 1, too below agency-normalized standards";
            default:
                return "Remedial standards";
        }
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf(
                "Student", "Physics", "Chemistry", "Math", "Total",
                "Average", "Percentage", "Grade", "Remarks");
        for (int i = 0; i < scores.length; i++) {
            String grade = determineGrade(results[i][2]);
            String remarks = gradeRemarks(grade);
            System.out.printf(
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grade, remarks);
        }
    }
}