package multiThreading.bankingSystemMultipleTransactions;

public class BankingApp {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        int[] amounts = {3000, 4000, 2000, 5000, 1500};

        Thread[] threads = new Thread[amounts.length];
        for (int i = 0; i < amounts.length; i++) {
            String customerName = "Customer-" + (i + 1);
            Transaction task = new Transaction(account, customerName, amounts[i]);
            Thread thread = new Thread(task);
            thread.setName(customerName);
            threads[i] = thread;
        }

        for (Thread thread : threads) {
            System.out.println("Thread state before start: " + thread.getName() + " -> " + thread.getState());
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
