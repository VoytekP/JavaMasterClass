package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // we used the max and min number that int can hold
        int max = Integer.MIN_VALUE;
//        boolean first = true; // also know as a flag

        while(true) { // this is infinite loop

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

//                if (first) { // this simple flag is tight to the flag to avoid getting zero
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }

    System.out.println("min= " + min + ", max= " + max);
    scanner.close();

    // write your code here
    }
}
