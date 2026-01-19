package org.scenario.BudgetWise;

class AnnualBudget extends Budget {

    AnnualBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("Annual Budget Summary");
        System.out.println("Yearly Savings: " + calculateSavings());
    }

    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed");
    }
}
