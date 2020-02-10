package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//
//        while (counter <= 10) {
//            System.out.println("Enter number # " + counter);
//
//            boolean isNumber = scanner.hasNextInt();
//
//            if (isNumber) {
//                int number = scanner.nextInt();
//                sum += number;
//            } else {
//                System.out.println("invalid value");
//                scanner.nextLine();
//                continue;
//            }
//
//            counter++;
//        }
//
//        System.out.println("sum of number entered is " + sum);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while (true) {
            while (counter < 10 ) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line(enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();



    }
}
