package com.springboot.code_challenge.algorithmics.numbers.twoPrimesSum;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionDiffblueTest {
    /**
     * Method under test: {@link Solution#isPrime(Integer)}
     */
    @Test
    void testIsPrime() {
        assertFalse(Solution.isPrime(10));
        assertTrue(Solution.isPrime(1));
        assertFalse(Solution.isPrime(15));
    }
}
