public class Main {

    public static void main(String[] args) {

        //Attributes
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //Calling the method
        calculateScore(gameOver, score, levelCompleted, bonus);

        //modifying the attributes
        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        //Calling the method again
        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    //Created the method that is returning the value(int) back to the code
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            System.out.println("Your final score was -1");
            return -1;
        }
    }
}

