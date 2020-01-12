package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("Yor final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus );
        System.out.println("Yor final score was " + highScore);

        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Name One", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Name Two", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Name Three", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Name Four", highScorePosition);

        highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("Name Five", highScorePosition);

    }

    public static void displayHighScorePosition(String playersName, int calculatedHighScorePosition) {
        System.out.println(playersName + " managed to get into position "
                + calculatedHighScorePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playersScore) {
//        if (playersScore >= 1000) {
//            return 1;
//        } else if (playersScore >= 500) {
//            return 2;
//        } else if (playersScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned.

        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
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
