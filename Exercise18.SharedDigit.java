package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Two numbers has shared digit = " + hasSharedDigit(9,99));
	// write your code here
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        // setting up the range 10 to 99
        if (number1 <10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;
        // remaining
        int firstDigit = number1 % 10;
        int secondDigit = number2 % 10;
        // moving the decimal
        number1 = number1/10;
        number2 = number2/10;

        if (firstDigit == secondDigit || firstDigit == number2)
            return true;
        if (number1 == secondDigit || number1 == number2)
            return true;
        return false;

    }

}

