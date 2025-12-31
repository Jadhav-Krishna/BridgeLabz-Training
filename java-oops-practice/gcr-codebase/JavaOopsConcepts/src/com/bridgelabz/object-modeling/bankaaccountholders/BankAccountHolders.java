package bankaaccountholders;

public class BankAccountHolders {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank boi = new Bank("BOI");

        Customer ram = new Customer("Ram");
        Customer shyam = new Customer("Shyam");

        sbi.openAccount(ram, 5000);
        boi.openAccount(shyam, 8000);

        ram.viewBalance();
        shyam.viewBalance();
    }
}
