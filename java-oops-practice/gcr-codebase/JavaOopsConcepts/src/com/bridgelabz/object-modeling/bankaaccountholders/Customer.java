package bankaaccountholders;

class Customer {
    String customerName;
    double accountBalance;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    void viewBalance() {
        System.out.println(customerName + " balance: ₹" + accountBalance);
    }
}