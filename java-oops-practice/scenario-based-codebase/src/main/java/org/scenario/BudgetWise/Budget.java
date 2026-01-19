package org.scenario.BudgetWise;

import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected Map<String, Double> categoryLimits = new HashMap<>();
    protected List<Transaction> transactions = new ArrayList<>();

    Budget(double income) {
        this.income = income;
    }

    void addCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    void addTransaction(Transaction t) {
        transactions.add(t);
    }

    double calculateSavings() {
        double expense = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("expense")) {
                expense += t.getAmount();
            }
        }
        return income - expense;
    }
}
