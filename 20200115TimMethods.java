package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println("****************");

        String playersName = "John";
        int position = calculatedHighScorePosition(1500);
        displayHighScorePosition(playersName,position);

        String playersName2 = "Mike";
        position = calculatedHighScorePosition(900);
        displayHighScorePosition(playersName2,position);

        String playersName3 = "Sam";
        position = calculatedHighScorePosition(400);
        displayHighScorePosition(playersName3,position);

        String playersName4 = "Frank";
        position = calculatedHighScorePosition(50);
        displayHighScorePosition(playersName4,position);
    }

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculatedHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
