package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Has same last digit = " + hasSameLastDigit(41,32,71));
        System.out.println("Has same last digit = " + hasSameLastDigit(23,32,42));
        System.out.println("Has same last digit = " + hasSameLastDigit(9,99,999));

        System.out.println("The number is valid = " + isValid(10));
        System.out.println("The number is valid = " + isValid(468));
        System.out.println("The number is valid = " + isValid(1051));


        // write your code here
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000)
            return false;
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        num1 = num1 / 10;
        num2 = num2 / 10;
        num3 = num3 / 10;

        if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3)
            return true;
        return false;
    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000)
            return false;
        else 
        return true;
    }

}
