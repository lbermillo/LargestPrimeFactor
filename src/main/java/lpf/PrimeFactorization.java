package lpf;

import java.math.BigInteger;

public interface PrimeFactorization {
    static boolean isPrime (int number) {
         /**
            this method checks if the passed integer is prime or not
         **/ 
        
        // we consider anything less than 2 as a prime number
        if (number < 2)
            return false;
        
        // iterate up to the given number starting from 2
        for (int i = 2; i < number; i++)
            // check if it's even using the modulo operator
            if (number % i == 0)
                return false;
  
        return true;
    }

    static long factorization(String number) {
        /**
            this is the meat of the solution, it will use the Prime Factorization to
            solve the problem: https://www.mathsisfun.com/prime-factorization.html
        **/
        
        BigInteger dividend = new BigInteger(number);
        int prime = 2;
        
        // while the dividend is not equal to prime 
        while (!dividend.equals(BigInteger.valueOf(prime)))
            // check if dividend is even: dividend % prime == 0
            if (dividend.mod(BigInteger.valueOf(prime)).equals(BigInteger.valueOf(0)))
                // update dividend with the quotient of the dividend and prime
                dividend = dividend.divide(BigInteger.valueOf(prime));
            else
                // get the next prime number
                prime = getNextPrime(prime);

        return prime;
    }

    static int getNextPrime(int number) {
        /**
            this method finds and returns the next integer prime number 
            from the ongoing count 
        **/
        int nextNumber = number;
        
        // we return 2 if the number passed is less than 1
        // else just increment the number
        if (number < 1)
            return 2;
        else
            nextNumber++;

        // increment nextNumber until it is a prime number
        while (!isPrime(nextNumber))
            nextNumber++;

        return nextNumber;
    }
}
