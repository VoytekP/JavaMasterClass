package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of First and Last Digit = " + sumFirstAndLastDigit(9059489));

	// write your code here
    }
    public static int sumFirstAndLastDigit(int number){
            // if the number is greater or equal to zero
        if (number >= 0) {
            // extract the last number
            int lastDigit = number % 10;

            // wile number is more then 9
            while (number > 9) {
            // extract the first number
                number /= 10;
            }
            // Adding first number to last number
            return number + lastDigit;
        }
        return -1;
    }

}
