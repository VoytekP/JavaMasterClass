public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reversedInteger = 0;
        int reminder;
        int temp;

        temp = number;

        while (number != 0) {
            reminder = number % 10;
            reversedInteger = (reversedInteger * 10) + reminder;
            number /= 10;
        }
        if (temp == reversedInteger) {
            return true;
        }
        return false;
    }
}