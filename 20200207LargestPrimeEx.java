package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int count = 0, largestPrime = 0;
        if (number < 2) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    if (largestPrime < i) {
                        largestPrime = i;
                    }
                }
                count = 0;
            }
        }
        return largestPrime;
    }
}
