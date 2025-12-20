import java.util.*;

//	An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of persons : ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("weight " + (i + 1));
            weights[i] = sc.nextDouble();
            System.out.print("height " + (i + 1));
            heights[i] = sc.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Display results
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(weights));
        System.out.println(Arrays.toString(bmis));
        System.out.println(Arrays.toString(statuses));

        sc.close();
    }
}
