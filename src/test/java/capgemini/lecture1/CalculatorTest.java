package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    /// Sum function
    @Test
    @DisplayName("When we add two positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(1, 2) > 0);
    }

    @Test
    @DisplayName("When we add two big positive numbers we receive positive number")
        //Given-When-Then
    void sum_twoBigPositiveNumbers_positiveNumber() {
        assertTrue(calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE) > 0);
    }

    @Test
    @DisplayName("When we add two negative numbers we receive a negative number")
        //Given-When-Then
    void sum_twoPositiveNumbers_NegativeNumber() {
        assertTrue(calculator.sum(-11, -22) < 0);
    }

    @Test
    @DisplayName("When we add two big Negative numbers we receive Negative number")
        //Given-When-Then
    void sum_twoBigPositiveNumbers_NegativeNumber() {
        assertTrue(calculator.sum(-Integer.MAX_VALUE, -Integer.MAX_VALUE) < 0);
    }

    // Dif function

    @Test
    @DisplayName("We subtract a small number from a big positive number")
        //Given-When-Then
    void dif_oneBiggerPositiveAndOneSmaller_positive() {
        assertTrue(calculator.dif(7, 1) > 0);
        assertTrue(calculator.dif(1002, 777) > 0);
        assertTrue(calculator.dif(898, 88) > 0);
    }

    @Test
    @DisplayName("We subtract a smaller negative number from a big negative number")
        //Given-When-Then
    void dif_oneBiggerNegativeAndOneSmaller_positive() {
        assertTrue(calculator.dif(-7, -9) > 0);
        assertTrue(calculator.dif(-1002, -20000) > 0);
        assertTrue(calculator.dif(-8, -88879) > 0);
    }

    @Test
    @DisplayName("We subtract a big positive from a small positive")
    void dif_oneSmallPositiveAndOneBigPositive_negative() {
        assertTrue(calculator.dif(9, 90) < 0);
        assertTrue(calculator.dif(132, 1243546) < 0);
    }

    @Test
    @DisplayName("We subtract a big negative from a small negative")
    void dif_eadwdwaadawaawdawwddadw() {
        assertTrue(calculator.dif(-90, -9) > 0);
        assertTrue(calculator.dif(-131243546,-77) > 0);
    }
}