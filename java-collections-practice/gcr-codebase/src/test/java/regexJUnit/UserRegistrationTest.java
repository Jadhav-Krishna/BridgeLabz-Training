package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.UserRegistration;

public class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        assertTrue(UserRegistration.registerUser("krishna", "krishna@test.com", "Password1"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "test@test.com", "Password1");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("user", "invalidemail", "Password1");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("user", "user@test.com", "pass");
        });
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(null, null, null);
        });
    }
}
