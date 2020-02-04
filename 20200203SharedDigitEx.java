package academy.learnprogramming;

public class SharedDigit {

    public static boolean hasSharedDigit(int start, int finish) {
        if (((start < 10) || (start > 99)) || ((finish < 10) || (finish > 99))) {
            return false;
        }
        int leftDigitStart = start / 10;
        int rightDigitStart = start % 10;
        int leftDigitFinish = finish / 10;
        int rightDigitFinish = finish % 10;

        if ((leftDigitStart == leftDigitFinish) || (leftDigitStart == rightDigitFinish) ||
                (rightDigitStart == leftDigitFinish) || (rightDigitStart == rightDigitFinish)) {
            return true;
        } else {
            return false;
        }
    }
}
