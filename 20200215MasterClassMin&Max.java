package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter number");
//
//        int number1 = scanner.nextInt();
//
//        while (true) {
//            System.out.println("Enter Second Number");
//            int number2 = scanner.nextInt();
//            if (number1 > number2) {
//                System.out.println(number1 + " is larger then " + number2);
//            } else if (number2 > number1){
//                System.out.println(number2 + " is larger then " + number1);
//            }
//            scanner.close();
//        }

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // when using Boolean Flag min = 0
        int max = Integer.MIN_VALUE; // when using Boolean Flag max = 0
//        boolean first = true; // Boolean Flag !!!

        while (true) {

            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

//                if (first) { //  Boolean Flag !!!
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
    }
}
