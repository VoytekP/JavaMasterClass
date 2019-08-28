package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Palindrome number: " + isPalindrome(1010));
	// write your code here
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int initialNumber = number;

        if (number < 0) {
            number = number * -1;
            initialNumber = initialNumber * -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        } if (initialNumber == reverse) {
            return true;
        } else {
            return false;
        }

    }

}
