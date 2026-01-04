package org.scenario.MyBank;

public abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected double getBalanceInternal() {
        return balance;
    }

    protected void updateBalance(double amount) {
        this.balance += amount;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            updateBalance(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            updateBalance(-amount);
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}
