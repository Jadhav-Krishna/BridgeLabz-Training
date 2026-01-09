package org.scenario.Artify;

public class User {
	private String name;
	private double walletBalance;
	
	User(String name, double walletBalance){
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getWalletBalance() {
		return this.walletBalance;
	}

	public boolean deductFromWallet(double amount) {
		if (amount <= 0) {
			return false;
		}
		if (this.walletBalance < amount) {
			return false;
		}
		this.walletBalance -= amount;
		return true;
	}

	public void addToWallet(double amount) {
		if (amount > 0) {
			this.walletBalance += amount;
		}
	}
}
