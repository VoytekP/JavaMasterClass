package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        for ( int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                num++;
                sum += i;
                System.out.println("Number that can be divided by 3 & 5 is " + i);

            }
            if (num == 5) {
                    System.out.println("End of the loop");
                break;
            }
        }
        System.out.println("Sum of all numbers = " + sum);
    }
}
