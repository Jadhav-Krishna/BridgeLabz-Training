package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.StringUtils;

public class StringUtilsTest {

    @Test
    void testReverse() {
        String input = "hello";
        String expected = "olleh";
        String actual = StringUtils.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void testIsPalindromeTrue() {
        String input = "madam";
        assertTrue(StringUtils.isPalindrome(input));
    }

    @Test
    void testIsPalindromeFalse() {
        String input = "java";
        assertFalse(StringUtils.isPalindrome(input));
    }

    @Test
    void testToUpperCase() {
        String input = "java";
        String expected = "JAVA";
        String actual = StringUtils.toUpperCase(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNullInput() {
        assertNull(StringUtils.reverse(null));
        assertFalse(StringUtils.isPalindrome(null));
        assertNull(StringUtils.toUpperCase(null));
    }
}
