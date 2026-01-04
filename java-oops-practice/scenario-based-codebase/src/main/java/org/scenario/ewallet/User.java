package org.scenario.ewallet;

public class User {
    private int userId;
    private String name;
    private Wallet wallet;

    public User(int userId, String name) {
        this(userId, name, 0);
    }

    public User(int userId, String name, double initialBalance) {
        this.userId = userId;
        this.name = name;
        this.wallet = new Wallet(initialBalance);
    }

    public int getUserId() { 
    	return userId; 
    }
    public String getName() { 
    	return name; 
    }
    public Wallet getWallet() { 
    	return wallet; 
    }
}

