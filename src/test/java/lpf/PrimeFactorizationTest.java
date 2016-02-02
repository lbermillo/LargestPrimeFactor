package lpf;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeFactorizationTest {

    @Test
    public void canaryTest() { assertTrue(true); }

    @Test
    public void validateIfTwoIsAPrimeNumber() { assertTrue(PrimeFactorization.isPrime(2)); }

    @Test
    public void validateIfThreeIsAPrimeNumber() { assertTrue(PrimeFactorization.isPrime(3)); }

    @Test
    public void validateIfFourIsAPrimeNumber() { assertFalse(PrimeFactorization.isPrime(4)); }

    @Test
    public void validateIfZeroIsAPrimeNumber() { assertFalse(PrimeFactorization.isPrime(0)); }

    @Test
    public void validateIfANegativeNumberIsAPrimeNumber() { assertFalse(PrimeFactorization.isPrime(-5)); }

    @Test
    public void getNextPrimeNumberAfterTwo() { assertEquals(3, PrimeFactorization.getNextPrime(2)); }

    @Test
    public void getNextPrimeNumberAfterFive() { assertEquals(7, PrimeFactorization.getNextPrime(5)); }

     @Test
    public void getNextPrimeNumberAfterSeven() { assertEquals(11, PrimeFactorization.getNextPrime(7)); }

    @Test
    public void getNextPrimeNumberAfterZero() { assertEquals(2, PrimeFactorization.getNextPrime(0)); }

    @Test
    public void getNextPrimeNumberAfterANegativeNumber() { assertEquals(2, PrimeFactorization.getNextPrime(-3)); }

    @Test
    public void largestPrimeFactorOfTwelve() { assertEquals(3, PrimeFactorization.factorization("12")); }

    @Test
    public void largestPrimeFactorOfFourteen() { assertEquals(7, PrimeFactorization.factorization("14")); }

    @Test
    public void largestPrimeFactorOfSeventeen() { assertEquals(17, PrimeFactorization.factorization("17")); }

    @Test
    public void largestPrimeFactorOfNinetyNine() { assertEquals(11, PrimeFactorization.factorization("99")); }

    @Test
    public void largestPrimeFactorOf600851475143() { assertEquals(6857, PrimeFactorization.factorization("600851475143")); }
}
