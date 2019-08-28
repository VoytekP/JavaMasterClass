package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of even numbers = " + getEvenDigitSum(2346780));
        // write your code here
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {

            int sum = 0;
            // while loop - checking if the number is greater then 0
            while (number > 0) {
                // 1st - taking last number; 2nd - checking if its even
                if (number % 10 % 2 == 0) {
                    // adding the even digit to the sum total
                    sum += number % 10;
                }
                // moving the decimal over
                number /= 10;
            }

            return sum;
        }
        return -1; // if above is less then 0 return -1
    }
}
