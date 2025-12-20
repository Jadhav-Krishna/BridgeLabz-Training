import java.util.*;

//	Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage  and then calculate the grade  as per the following guidelines
// taking input from the user
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of students: ");
        int size = sc.nextInt();

        int[] physicsMarks = new int[size];
        int[] chemistryMarks = new int[size];
        int[] mathsMarks = new int[size];
        double[] percentages = new double[size];
        String[] grades = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("marks " + (i + 1) + ":");

            System.out.print("Physics: ");
            int physics = sc.nextInt();
            physicsMarks[i] = physics;
            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();
            chemistryMarks[i] = chemistry;
            System.out.print("Maths: ");
            int maths = sc.nextInt();
            mathsMarks[i] = maths;

            double percentage = (physics + chemistry + maths) / 3;
            percentages[i] = percentage;
            if (percentage >= 80 && percentage <= 100) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70 && percentage <= 79) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60 && percentage <= 69) {
                grades[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50 && percentage <= 59) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40 && percentage <= 49) {
                grades[i] = "Level 1, too below agency-normalized standards";
            } else if (percentage >= 0 && percentage <= 39) {
                grades[i] = "Remedial Standards";
            } else {
                grades[i] = "Enter correct marks";
            }
        }
        System.out.println(Arrays.toString(percentages));
        System.out.println(Arrays.toString(grades));
    }
}