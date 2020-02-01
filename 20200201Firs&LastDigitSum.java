package academy.learnprogramming;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit;

        if ((number > 0) && (number <= 9)) {
            return number * 2;
        }
        int sum = 0;
        while (number >= 10) {
                lastDigit = number % 10;
                sum += lastDigit;
                while (number >= 10) {
                    number /= 10;
                }
                sum += number;
            }
        return sum;
    }
}

