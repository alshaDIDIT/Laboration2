package se.iths;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.*;


public class CalculatorTest
{

    @BeforeEach
    void init() {
        System.out.println("Test före varje test");
    }

    @RepeatedTest(3)
    @DisplayName("a + b")
    public void aPlusBTest() {
        Calculator calculator = new Calculator();
        assertNotEquals( 10, Calculator.add(1, 8) );
        System.out.println("Succeded");
    }

    @Test
    @DisplayName("a - b")
    public void aMinusBTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, Calculator.subtract(6, 4));
        System.out.println("Succeded");
    }

    @Test
    @DisplayName("a * b")
    public void aMultipliedByBTest() {
        Calculator calculator = new Calculator();
        assertFalse(18==Calculator.multiply(6, 9));
        System.out.println("Succeded");
    }

    @RepeatedTest(9)
    @DisplayName("a / b")
    public void aDividedByBTest() {
        Calculator calculator = new Calculator();
        assertTrue(3==Calculator.divide(9, 3));
        System.out.println("Succeded");
    }



}
