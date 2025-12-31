package bankaaccountholders;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialAmount) {
        customer.accountBalance = initialAmount;
        System.out.println("Account opened for " + customer.customerName +
                " in " + bankName);
    }
}

