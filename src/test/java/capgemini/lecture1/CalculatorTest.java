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

    @Test
    @DisplayName("We add positive and netatives")
    void sum_NegativeAndPositive(){
        assertTrue(calculator.sum(77,-7) == 70);
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
    void dif_SmallNegativeAndBigNegative_positive() {
        assertTrue(calculator.dif(-90, -9) > 0);
        assertTrue(calculator.dif(-131243546,-77) > 0);
    }

    // multiply function

    @Test
    @DisplayName("When we multiply two positives we get a positive")
    void multiply_twoPositives_positive() {
        assertTrue(calculator.multiply(8, 34) > 0);
        assertTrue(calculator.multiply(7, 7) > 0);
    }

    @Test
    @DisplayName("When we multiply two negative numbers we get a positive number")
    void multiply_twoNegatives_positive() {
        assertTrue(calculator.multiply(-6, -123) > 0);
        assertTrue(calculator.multiply(-76, -8) > 0);
    }

    @Test
    @DisplayName("When we multiply a negative to a positive we get a negative number")
    void multiply_onePositiveoneNegative_positive() {
        assertTrue(calculator.multiply(-68, 123) < 0);
        assertTrue(calculator.multiply(987, -65) < 0);
    }

    @Test
    @DisplayName("When we multiply anything by 0 we get 0")
    void multiply_anythingAndZero_zero() {
        assertTrue(calculator.multiply(-68, 0) == 0);
        assertTrue(calculator.multiply(987, 0) == 0);
    }

    @Test
    @DisplayName("When we multiply a number and 1 we get that number")
    void multiply_aNumberAndOne_thatNumber() {
        assertTrue(calculator.multiply(-68, 1) == -68);
        assertTrue(calculator.multiply(1, 0) == 0);
        assertTrue(calculator.multiply(1, 7) == 7);
    }

    @Test
    @DisplayName("When we multiply two big positives we get a positive")
    void multiply_twoBigPositives_positive() {
        assertTrue(calculator.multiply(Integer.MAX_VALUE, 34) > 0);
        assertTrue(calculator.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE) > 0);
    }

    @Test
    @DisplayName("When we multiply two small negatives we get a positive")
    void multiply_twoSmallNegatives_positive() {
        assertTrue(calculator.multiply(-Integer.MAX_VALUE, -34) > 0);
        assertTrue(calculator.multiply(-Integer.MAX_VALUE, -Integer.MAX_VALUE) > 0);
    }

    @Test
    @DisplayName("When we multiply a small negative and a positive")
    void multiply_aSmallNegativeAndAPositive_Negative() {
        assertTrue(calculator.multiply(-Integer.MAX_VALUE, 789) < 0);
        assertTrue(calculator.multiply(-Integer.MAX_VALUE, Integer.MAX_VALUE) < 0);
    }

    // divide function

    @Test
    @DisplayName("When we divide a number by 1 we get that number")
    void divide_aNumberByOne_thatNumber() {
        assertTrue(calculator.divide(5, 1) == 5);
        assertTrue(calculator.divide(-76, 1) == -76);
    }

    @Test
    @DisplayName("When we divide a number by 0 we get an error")
    void divide_aNumberByZero_error() {
        try{
            assertTrue(calculator.divide(-76, 0) == -76);
            assertTrue(false);
        }
        catch (ArithmeticException e)
        {
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("When we divide a positive by a positive we get a positive")
    void divide_twoPositives_positive() {
        assertTrue(calculator.divide(5, 4) > 0);
        assertTrue(calculator.divide(76, 321) > 0);
    }

    @Test
    @DisplayName("When we divide two negatives we get a positive")
    void divide_twoNegatives_positive() {
        assertTrue(calculator.divide(-5, -4) > 0);
        assertTrue(calculator.divide(-76, -321) > 0);
    }

    @Test
    @DisplayName("When we divide a negative by a positive we get a negative")
    void divide_aPositiveByANegative_negative() {
        assertTrue(calculator.divide(-5, 4) < 0);
        assertTrue(calculator.divide(76, -321) < 0);
    }

    @Test
    @DisplayName("When we divide a number by itself we get 1")
    void divide_aNumberByItself_one() {
        assertTrue(calculator.divide(5, 5) == 1);
        assertTrue(calculator.divide(-76, -76) == 1);
        assertTrue(calculator.divide(Double.MAX_VALUE, Double.MAX_VALUE) == 1);
    }
}