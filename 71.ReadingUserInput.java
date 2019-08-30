package academy.learnprogramming;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter yur name: ");
        String name = scanner.nextLine();
        int age = 2019 - yearOfBirth;

        System.out.println("Your name is " + name + ", you are age " + age + " years old.");

        scanner.close();
	// write your code here
    }
}
