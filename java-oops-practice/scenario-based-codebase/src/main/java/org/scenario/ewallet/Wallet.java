package org.scenario.ewallet;

public class Wallet {
    private double balance;

    public Wallet() {
        this(0);
    }

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void loadBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount positive");
        }
        this.balance += amount;
    }

    protected void deduct(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
    }

    protected void credit(double amount) {
        this.balance += amount;
    }
}
