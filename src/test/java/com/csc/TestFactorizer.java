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

    // portfolio add-on for is it prime?
    @Test
    public void testprime() {
        assertEquals(false, factorizer.prime(1));
        assertEquals(true, factorizer.prime(2));
        assertEquals(false, factorizer.prime(4));
        assertEquals(true, factorizer.prime(13));
        assertEquals(false, factorizer.prime(56));
        assertEquals(true, factorizer.prime(293));
    }
    // portfolio add-on for is it composite?
    @Test
    public void testcomposite() {
        assertEquals(false, factorizer.composite(1));
        assertEquals(false, factorizer.composite(2));
        assertEquals(true, factorizer.composite(4));
        assertEquals(false, factorizer.composite(13));
        assertEquals(true, factorizer.composite(56));
        assertEquals(false, factorizer.composite(293));
    }
}