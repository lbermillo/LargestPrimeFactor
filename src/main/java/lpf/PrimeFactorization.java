package lpf;

import java.math.BigInteger;

public interface PrimeFactorization {
    static boolean isPrime (int number) {
        if (number < 2)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    static long factorization(String number) {
        BigInteger dividend = new BigInteger(number);
        int prime = 2;

        while (!dividend.equals(BigInteger.valueOf(prime)))
            if (dividend.mod(BigInteger.valueOf(prime)).equals(BigInteger.valueOf(0)))
                dividend = dividend.divide(BigInteger.valueOf(prime));
            else
                prime = getNextPrime(prime);

        return prime;
    }

    static int getNextPrime(int number) {
        int nextNumber = number;

        if (number < 1)
            return 2;
        else
            nextNumber++;

        while (!isPrime(nextNumber))
            nextNumber++;

        return nextNumber;
    }
}
