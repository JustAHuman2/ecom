package ru.exite.ecom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ZeroCounterTest {

    private ZeroCounter zeroCounter;

    @BeforeEach
    public void setUp() {
        zeroCounter = new ZeroCounter();
    }

    @Test
    public void given1_whenCountZeroes_thenZero() {
        int expected = 0;

        int actual = zeroCounter.getFactorialZeroes(1);

        assertEquals(expected, actual);
    }

    @Test
    public void givenZero_whenCountZeroes_thenZero() {
        int expected = 0;

        int actual = zeroCounter.getFactorialZeroes(0);

        assertEquals(expected, actual);
    }

    @Test
    public void givenNegativeNum_whenCountZeroes_thenMinusOne() {
        int expected = -1;

        int actual = zeroCounter.getFactorialZeroes(-123);

        assertEquals(expected, actual);
    }

    @Test
    public void given12345_whenCountZeroes_thenSameResultAsSimpleCounting() {
        int number = 12345;
        int expected = getTrailingZeroes(getFactorial(number));

        int actual = zeroCounter.getFactorialZeroes(number);

        assertEquals(expected, actual);
    }

    @Test
    public void given27834_whenCountZeroes_thenSameResultAsSimpleCounting() {
        int number = 27834;
        int expected = getTrailingZeroes(getFactorial(number));

        int actual = zeroCounter.getFactorialZeroes(number);

        assertEquals(expected, actual);
    }

    @Test
    public void given100000_whenCountZeroes_thenSameResultAsSimpleCounting() {
        int number = 100_000;
        int expected = getTrailingZeroes(getFactorial(number));

        int actual = zeroCounter.getFactorialZeroes(number);

        assertEquals(expected, actual);
    }

    @Test
    public void given13572_whenCountZeroes_thenSameResultAsSimpleCounting() {
        int number = 13572;
        int expected = getTrailingZeroes(getFactorial(number));

        int actual = zeroCounter.getFactorialZeroes(number);

        assertEquals(expected, actual);
    }

    private BigInteger getFactorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private int getTrailingZeroes(BigInteger number) {
        return (int) new StringBuilder(String.valueOf(number)).reverse().toString().chars().takeWhile(ch -> ch == '0').count();
    }
}