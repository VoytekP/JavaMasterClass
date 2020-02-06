package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords(int number) { // method#1
        int num = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= getDigitCount(number); i++) {  // # 4 Repeat steps 2 through 4 until num = 0
            int lastDigit = num % 10;                       // # 1 Extracting the last digit of the given number using the remainder
            num /= 10;                                      // # 3 removing the last digit from the number
            switch (lastDigit) {                            // # 2 converting the value of the digit found 
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) { // thanks to this method#2 we reverse the order of the first method "numberToWords"
        int reversNumber = 0;
        int lastDigit;
        for (; number != 0; number /= 10) { // I did not use the first statement - "int = i" - in for loop, since its not used
            lastDigit = number % 10;
            reversNumber = (reversNumber * 10) + lastDigit;
        }
        return reversNumber;
    }

    public static int getDigitCount(int number) { // this method#3 is to count how many digits we have nad then used in for loop of our first method.
        int digitCount = 0;
        if (number < 0)
            return -1;
        if (number == 0)
            return 1;
        for (int i = number; i != 0; i /= 10) {
            digitCount++;
        }
        return digitCount;
    }
}
