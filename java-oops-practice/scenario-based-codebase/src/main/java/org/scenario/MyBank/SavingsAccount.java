package org.scenario.MyBank;

public class SavingsAccount extends Account {

    private double interestRate = 4.0;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}
