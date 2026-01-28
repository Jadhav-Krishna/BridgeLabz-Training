package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.MathUtils;

public class MathUtilsTest {

    @Test
    void testDivideThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            MathUtils.divide(10, 0);
        });
    }

    @Test
    void testDivideSuccess() {
        int result = MathUtils.divide(10, 2);
        assertEquals(5, result);
    }
}
