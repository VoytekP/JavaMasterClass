package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Largest Prime = " + getLargestPrime(21));
        System.out.println("Largest Prime = " + getLargestPrime(217));
        System.out.println("Largest Prime = " + getLargestPrime(0));
        System.out.println("Largest Prime = " + getLargestPrime(45));
        System.out.println("Largest Prime = " + getLargestPrime(-1));

        // write your code here
    }

    public static int getLargestPrime( int number){
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++)
            while (number % i == 0 && number/i != 1) {
            number /= i;
        }
        return number;
    }
}
