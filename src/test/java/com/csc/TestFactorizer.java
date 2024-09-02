package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

    Factorizer factorizer;

    @BeforeEach
    void setUp() {
        factorizer = new Factorizer();
    }

    @Test
    public void testZero() {
        assertEquals(null, factorizer.prime_factors(0), "Factorization of 0 should return null");
    }

    @Test
    public void testOne() {
        assertEquals(null, factorizer.prime_factors(1), "Factorization of 1 should return null");
    }

    @Test
    public void testTen() {
        assertEquals("2,5", factorizer.prime_factors(10), "Factorization of 10 should be '2,5'");
    }

    @Test
    public void testCompositeNumber() {
        assertEquals("2,2,3,3", factorizer.prime_factors(36), "Factorization of 36 should be '2,2,3,3'");
    }

    @Test
    public void testPrimeNumber() {
        assertEquals("11", factorizer.prime_factors(11), "Factorization of 11 should be '11'");
    }

    @Test
    public void testLargeNumber() {
        assertEquals("2,2,3,3,7", factorizer.prime_factors(252), "Factorization of 252 should be '2,2,3,3,7'");
    }
}