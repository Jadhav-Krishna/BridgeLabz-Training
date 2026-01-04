package org.scenario.MyBank;

public class BankApp {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SBI1001", 5000);
        Account current = new CurrentAccount("BOI2001", 10000);

        savings.deposit(2000);
        savings.withdraw(1000);

        current.deposit(3000);
        current.withdraw(5000);

        System.out.println("Savings Balance: " + savings.checkBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println("Current Balance: " + current.checkBalance());
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}
