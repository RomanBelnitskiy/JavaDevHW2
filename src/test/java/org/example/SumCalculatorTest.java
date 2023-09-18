package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Sum method tests")
class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void init() {
        calculator = new SumCalculator();
    }

    @Test
    @DisplayName("when pass 1 to sum method then it returns 1")
    void testSum_WhenPassOne_ThenReturnsOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    @DisplayName("when pass 3 to sum method then it returns 6")
    void testSum_WhenPassThree_ThenReturnsSix() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    @DisplayName("when pass 0 to sum method then it throws exception")
    void testSum_WhenPassZero_ThenThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

    @Test
    @DisplayName("when pass -1 to sum method then it throws exception")
    void testSum_WhenPassLessThanZero_ThenThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    }
}