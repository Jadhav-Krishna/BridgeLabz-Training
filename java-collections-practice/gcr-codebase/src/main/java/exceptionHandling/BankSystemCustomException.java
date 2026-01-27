package exceptionHandling;

public class BankSystemCustomException {

    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        }
    }

    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws InsufficientBalanceException {

            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(5000);

        try {
            acc.withdraw(2000);
            // acc.withdraw(7000);
            // acc.withdraw(-100);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
