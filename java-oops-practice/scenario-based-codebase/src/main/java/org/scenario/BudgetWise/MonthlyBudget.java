package org.scenario.BudgetWise;

class MonthlyBudget extends Budget {

    MonthlyBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("Monthly Budget Report");
        System.out.println("Savings: " + calculateSavings());
    }

    public void detectOverspend() {
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;

            for (Transaction t : transactions) {
                if (t.getCategory().equals(cat) &&
                    t.getType().equals("expense")) {
                    spent += t.getAmount();
                }
            }

            if (spent > categoryLimits.get(cat)) {
                System.out.println("Overspend in " + cat);
            }
        }
    }
}
