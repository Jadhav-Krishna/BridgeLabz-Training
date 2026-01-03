package org.scenario.ewallet;

public class PersonalWallet extends Wallet implements Transferable {
    private static final double DAILY_LIMIT = 5000;
    private double transferredToday = 0;

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (transferredToday + amount > DAILY_LIMIT) {
            throw new IllegalArgumentException("Daily limit exceeded");
        }
        deduct(amount);
        receiver.getWallet().credit(amount);
        transferredToday += amount;
    }
}
