import java.util.*;

//	An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual using 2D array.

public class BMICalculatorMultidimentional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of persons : ");
        int n = sc.nextInt();

	double[][] personData = new double[n][3];
	String[] weightStatus = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("weight " + (i + 1));
            personData[i][0] = sc.nextDouble();
            System.out.print("height " + (i + 1));
            personData[i][1] = sc.nextDouble();
	    personData[i][2] = (personData[i][0] / personData[i][1] * personData[i][1]);
        }

        // Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results
        System.out.println(Arrays.toString(weightStatus));

        sc.close();
    }
}