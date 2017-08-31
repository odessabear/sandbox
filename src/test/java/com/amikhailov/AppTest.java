package com.amikhailov;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Test
    public void testMathAbsNonNegativeInt() {
        // arrange
        int input = 8;
        // act
        int result = new Utils().returnAbs(input);
        // assert
        assert result == 8;
    }

    @Test
    public void testMathAbsNegativeInt() {
        // arrange
        int input = -3;
        // act
        int result = new Utils().returnAbs(input);
        // assert
        assert result == 3;
    }

    @Test
    public void testMathAbsZero() {
        // arrange
        int input = 0;
        // act
        int result = new Utils().returnAbs(input);
        // assert
        assert result == 0;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMathAbsNull() {
        // arrange
        Integer input = null;
        // act
        int result = new Utils().returnAbs(input);
        // assert
        assert result == 0;
    }
}
