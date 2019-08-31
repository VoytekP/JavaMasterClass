 package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int average = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                counter++;
                int myInt = scanner.nextInt();
                sum += myInt;
                average = (int) Math.round((double) sum /counter);
            } else {
                System.out.println("Sum = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }

        scanner.close();

	// write your code here
    }
}
