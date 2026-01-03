package org.scenario.ewallet;

public class EWalletRunner {
    public static void main(String[] args) {
        User u1 = new User(1, "Muskan", 2000);
        User u2 = new User(2, "Shna", 500);

        PersonalWallet u1Wallet = new PersonalWallet(u1.getWallet().getBalance());
        BusinessWallet u2Wallet = new BusinessWallet(u2.getWallet().getBalance());

        u1Wallet.loadBalance(1000);
        u2Wallet.loadBalance(2000);

        u1Wallet.transferTo(u2, 1500);

        System.out.println("Alice balance: " + u1Wallet.getBalance());
        System.out.println("Bob balance: " + u2Wallet.getBalance());
    }
}

