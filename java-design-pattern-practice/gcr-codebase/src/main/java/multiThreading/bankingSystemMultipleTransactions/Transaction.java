package multiThreading.bankingSystemMultipleTransactions;

import java.time.LocalDateTime;

public class Transaction implements Runnable {
    private final BankAccount account;
    private final String customerName;
    private final int amount;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Attempting to withdraw " + amount + " at " + LocalDateTime.now());
        int remaining = account.withdraw(amount);
        if (remaining >= 0) {
            System.out.println("Transaction successful: " + customerName + ", Amount: " + amount + ", Balance: " + remaining + ", Time: " + LocalDateTime.now());
        } else {
            System.out.println("Transaction failed: " + customerName + ", Amount: " + amount + ", Balance: " + account.getBalance() + ", Time: " + LocalDateTime.now());
        }
    }
}
