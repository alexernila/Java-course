public class Main {

    public static void main(String[] args) {

//        int score = 50; // score = 50 is an expression
//        if (score == 50) {
//            System.out.println("This is an expression");
//        }
//
//        int myVar = 50; // the entire line is a statement
//        myVar ++;
//        System.out.println("This is a test");
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ana", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jon", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + levelCompleted* bonus;
            finalScore += 2000;
            System.out.println("Final score is " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScoreTable){
        System.out.println(playerName + " managed to get into position " + highScoreTable + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore >= 500){
            return 2;
        } else if(playerScore >= 100){
            return 3;
        } else{
            return 4;
        }


    }


}

