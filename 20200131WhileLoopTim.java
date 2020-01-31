package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count value = " + count);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        int sumOfFiveEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Event number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total of 5 even numbers = " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
