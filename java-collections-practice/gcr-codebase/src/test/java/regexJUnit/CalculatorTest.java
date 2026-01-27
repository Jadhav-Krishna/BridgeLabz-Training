package regexJUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import regexJUnit.JUnit.Calculator;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("adds two positive integers")
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-7, calculator.add(-5, -2));
    }

    @Test
    @DisplayName("subtracts two integers")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-4, calculator.subtract(-2, 2));
        assertEquals(-3, calculator.subtract(-5, -2));
    }

    @Test
    @DisplayName("multiplies two integers")
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-4, calculator.multiply(-2, 2));
        assertEquals(10, calculator.multiply(-5, -2));
        assertEquals(0, calculator.multiply(0, 7));
    }

    @Test
    @DisplayName("divides two integers")
    void testDivide() {
        assertEquals(1, calculator.divide(5, 3));
        assertEquals(-1, calculator.divide(-2, 2));
        assertEquals(2, calculator.divide(-5, -2));
    }

    @Test
    @DisplayName("division by zero throws ArithmeticException with message")
    void testDivideByZero() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed.", ex.getMessage());
    }
}
