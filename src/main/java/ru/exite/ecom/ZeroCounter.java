package ru.exite.ecom;

import org.apache.log4j.Logger;

/**
 * @author Dmitry Stepanov
 */
public class ZeroCounter {

    private final static Logger LOG = Logger.getLogger(ZeroCounter.class);

    /**
     * Counts trailing zeroes of factorial of input number
     *
     * @param number input number
     * @return number of trailing zeroes or -1 for negative input
     */
    public int getFactorialZeroes(int number) {
        if (number < 0) return -1;
        int count = 0;
        for (int i = 5; number / i >= 1; i *= 5) {
            count += number / i;
        }
        LOG.info("For number " + number + " counted number of factorial trailing zeroes: " + count);
        return count;
    }
}