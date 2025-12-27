// Implement a constructor to initialize these members. Create a subclass SavingsAccount that accesses the public and protected members and demonstrates the use of access modifiers.
package com.bridgelabz.constructor.levelone;
import java.util.*;
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Subclass SavingsAccount
    public static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        // Method to display SavingsAccount details
        public void displaySavingsAccountDetails() {
            System.out.println("Savings Account Number: " + accountNumber); // public member
            System.out.println("Savings Account Holder: " + accountHolder); //  protected member
            System.out.println("Savings Account Balance: " + getBalance()); //  private member via public method
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("BA123456", "Alice Smith", 5000.0);
        System.out.println("Bank Account Balance: " + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("SA654321", "Bob Johnson", 10000.0);
        savingsAccount.displaySavingsAccountDetails();
    }
}