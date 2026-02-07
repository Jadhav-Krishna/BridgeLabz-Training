package multiThreading.bankingSystemMultipleTransactions;

public class BankAccount {
    private int balance = 10000;

    public synchronized int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        }
        return -1;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
