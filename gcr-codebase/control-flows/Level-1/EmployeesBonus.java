// Created a class , and 
import java.util.*;
class EmployeesBonus{

    // Writing the logic to find bonus of employ.
    public static int BonusSalary(int salary,int year){
        int bonus;
        if(year >= 5){
            bonus = (salary/100)*5;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    // Main method with a scanner object
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Salary : ");
        int salary = sc.nextInt();
        System.out.print("Year : ");
        int year = sc.nextInt();

        // Function initialisation
        System.out.println(BonusSalary(salary,year));

        // Close the Scanner class
        sc.close();
    }
}