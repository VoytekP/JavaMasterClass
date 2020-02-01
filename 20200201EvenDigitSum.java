package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int reverse, sum = 0;

        while (number > 0) {
            reverse = number % 10;
            if (reverse % 2 == 0) {
                sum = sum + reverse;
            }
            number = number / 10;

        }
        return sum;
    }

}
