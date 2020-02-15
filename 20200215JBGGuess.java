package academy.learnprogramming;

// Guess the letter game

public class Guess {

    public static void main(String[] args)
    throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");

        ch = (char) System.in.read(); // get a char

        if (ch == answer)
            System.out.println("*** Right ***");
        else {
            System.out.println("... Sorry, you're wrong");
            // a nested if
            if (ch < answer)
                System.out.println("too low");
            else
                System.out.println("too high");
        }
    }

}
