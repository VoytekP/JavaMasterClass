package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("Perfect number = " + isPerfectNumber(6));
        System.out.println("Perfect number = " + isPerfectNumber(28));
        System.out.println("Perfect number = " + isPerfectNumber(5));
        System.out.println("Perfect number = " + isPerfectNumber(-1));


        // write your code here
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
