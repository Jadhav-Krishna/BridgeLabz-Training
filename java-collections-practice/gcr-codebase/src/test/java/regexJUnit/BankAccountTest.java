package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.BankAccount;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(400);
        assertEquals(600, acc.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        BankAccount acc = new BankAccount();
        acc.deposit(300);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(500);
        });
    }
}
