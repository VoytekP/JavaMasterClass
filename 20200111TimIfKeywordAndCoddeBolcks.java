package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000 && score > 1000) {
//            System.out.println("Your score was less then 5k but greater then 1k");
//        } else if (score < 1000) {
//            System.out.println("Your score was less then 1k");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

//        boolean gameOver2 = true;
//        int score2 = 10000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//
//        if (gameOver2) {
//            int finalScore2 = score2 + (levelCompleted2 * bonus2);
//            System.out.println("Your second final score was " + finalScore2);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
