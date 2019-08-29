package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("Greatest Common Divisor = " + getGreatestCommonDivisor(25, 15));
        System.out.println("Greatest Common Divisor = " + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest Common Divisor = " + getGreatestCommonDivisor(9, 18));
        System.out.println("Greatest Common Divisor = " + getGreatestCommonDivisor(81, 153));

        // write your code here
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10)
            return -1;
        while (num1 != 0 && num2 != 0) {
            int num3 = num2;
            num2 = num1 % num2;
            num1 = num3;
        }
        return num1 + num2;
    }
}
