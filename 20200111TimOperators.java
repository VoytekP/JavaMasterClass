package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        System.out.println("****************");

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        System.out.println("****************");

        int secondTopScore = 89;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then second top score and less then 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90) ){
            System.out.println("Either or both of the conditions are true");
        }

        System.out.println("****************");

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        System.out.println("****************");

        boolean isCar = false;
        if (isCar) {
            System.out.println("This happens...");
        }

        System.out.println("****************");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        System.out.println("**************** Challenge");

        double numOne = 20.00d;
        double numTwo = 80.00d;
        double theSum = (numOne + numTwo) * 100.00d;
        System.out.println("The sum = " + theSum);
        double theSumRemainder = theSum % 40.00d;
        System.out.println("theRemainder = " + theSumRemainder);

         boolean booleanOfSumRemainder = (theSumRemainder == 0) ? true : false;
        if (booleanOfSumRemainder) {
            System.out.println("Boolean of Sum Reminder is = 0");
        }
        else {
            System.out.println("Got some remainder");
        }


    }
}
