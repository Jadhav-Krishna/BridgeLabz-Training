import java.util.*;
// bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
class EmployBonus{
    public static void main(String[] args){
        double[][] empData = generateEmployeeData(10);
        double[][] updatedEmpData = calculateBonuses(empData);
        displaySalaryDetails(empData, updatedEmpData);
    }

    // random salary and years of service for employees
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        Random rand = new Random();
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }

    // salary and bonus based on years of service
    public static double[][] calculateBonuses(double[][] empData) {
        double[][] updatedData = new double[empData.length][3];
        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double yearsOfService = empData[i][1];
            double bonusRate = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // salary details in a tabular format
    public static void displaySalaryDetails(double[][] empData, double[][] updatedEmpData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-10s %-15s%n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < empData.length; i++) {
            double oldSalary = updatedEmpData[i][0];
            double bonus = updatedEmpData[i][1];
            double newSalary = updatedEmpData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
            System.out.printf("%-10d %-15.2f %-10.2f %-15.2f%n", (i + 1), oldSalary, bonus, newSalary);
        }
        System.out.printf("%-10s %-15.2f %-10.2f %-15.2f%n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }
}