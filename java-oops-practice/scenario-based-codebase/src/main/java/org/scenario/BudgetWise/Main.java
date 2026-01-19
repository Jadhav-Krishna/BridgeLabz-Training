package org.scenario.BudgetWise;

public class Main {
    public static void main(String[] args) {

        Budget budget = new MonthlyBudget(50000);

        budget.addCategoryLimit("Food", 10000);
        budget.addCategoryLimit("Travel", 8000);

        budget.addTransaction(new Transaction(4000, "expense", "10-Sep", "Food"));
        budget.addTransaction(new Transaction(9000, "expense", "15-Sep", "Travel"));

        budget.generateReport();
        budget.detectOverspend();
    }
}
