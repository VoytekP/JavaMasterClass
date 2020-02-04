package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 10000)) {
            return false;
        }
        // using modulo operator to get the last digit from each number
        int lastDigit1, lastDigit2, lastDigit3;
        lastDigit1 = number1 % 10;
        lastDigit2 = number2 % 10;
        lastDigit3 = number3 % 10;

        if ((lastDigit1) == (lastDigit2) || ((lastDigit2) == (lastDigit3)) || ((lastDigit1) == (lastDigit3))) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
