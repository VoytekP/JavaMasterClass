package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even number found = " + evenNumbersFound);
	// write your code here
    }

    public static boolean isEvenNumber (int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
