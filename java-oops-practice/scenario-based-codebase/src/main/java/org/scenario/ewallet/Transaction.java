package org.scenario.ewallet;

public class Transaction {
    private double transactionId;
    private String fromUser;
    private String toUser;
    private double amount;
    private String type;

    public Transaction(double transactionId, String fromUser, String toUser, double amount, String type) {
        this.transactionId = transactionId;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amount = amount;
        this.type = type;
    }
}