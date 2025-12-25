import java.util.*;
// BMI Calculator for 10 people
public class BMICalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("weight " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("height" + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }
        String[] status = determineBMIStatus(data);
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        System.out.println("Data: " + Arrays.deepToString(data));
        System.out.println("Status: " + Arrays.toString(status));
    }
// Calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
// BMI status based on BMI value
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }
}
