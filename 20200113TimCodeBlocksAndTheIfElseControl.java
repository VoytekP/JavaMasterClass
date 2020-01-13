package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gaveOver = true;
        int score = 80;
        int levelCompleted = 5;
        int bonus = 100;

        //        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less then 5000 but greater then 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less then 1000");
//        } else {
//            System.out.println("Got here haha... ");
//        }

        if (gaveOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);
        }

//        boolean gameOVer = true;
//        int score2 = 10_000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//        int finalScore2 = score2 + (levelCompleted2 * bonus2);
//
//
//        if (gameOVer == true) {
//            System.out.println("Your final score2 was " + finalScore2);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gaveOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
