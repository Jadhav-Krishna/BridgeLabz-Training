package org.scenario.ewallet;

public class BusinessWallet extends Wallet implements Transferable {
    private static final double TRANSACTION_FEE_RATE = 0.01;
    private static final double MIN_TRANSFER = 100;

    public BusinessWallet() { 
    	super(); 
    }
    public BusinessWallet(double initialBalance){ 
    	super(initialBalance); 
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount < MIN_TRANSFER) {
            throw new IllegalArgumentException("Amount must be at least " + MIN_TRANSFER);
        }
        double fee = amount * TRANSACTION_FEE_RATE;
        double totalDebit = amount + fee;
        deduct(totalDebit);
        receiver.getWallet().credit(amount);
    }
}
