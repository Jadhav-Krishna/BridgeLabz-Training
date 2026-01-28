package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.PasswordValidator;

public class PasswordValidatorTest {

    @Test
    void testValidPasswords() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("Secure9A"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(PasswordValidator.isValid("pass1"));
        assertFalse(PasswordValidator.isValid("password"));
        assertFalse(PasswordValidator.isValid("PASSWORD"));
        assertFalse(PasswordValidator.isValid("Passwrd"));
        assertFalse(PasswordValidator.isValid(null));
    }
}
