import java.util.*;

// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// taking the input from the user
public class EmployeesBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2];
        double[][] bonusData = new double[10][2];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // extering employee data
        for (int i = 0; i < 10; i++) {
            System.out.println("salary and yearService " + (i + 1) + " : ");
            double salary = sc.nextDouble();
            double yearsOfService = sc.nextDouble();

            if (salary < 0 || yearsOfService < 0) {
                System.out.println("wrong input");
                i--;
                continue;
            }
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        // calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            double newSalary = salary + bonus;
            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Displying the output
        System.out.println("Bonus : " + totalBonus);
        System.out.println("Old Salary : " + totalOldSalary);
        System.out.println("New Salary : " + totalNewSalary);

        sc.close();
    }
}