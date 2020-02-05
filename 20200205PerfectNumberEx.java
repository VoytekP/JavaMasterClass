package academy.learnprogramming;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int i = 1, sum = 0;

        while (i <= number / 2) {
            if ( number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == number;
    }
}
