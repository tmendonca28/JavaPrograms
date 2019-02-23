package com.mendonca;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String playerOneName = "Anthony";
        String playerTwoName = "Zebediah";
        String playerThreeName = "Juliet";
        String playerFourName = "Udyr";

        int myScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The final score is " + myScore);

        int scorePlayerOne = 1500;
        int scorePlayerTwo = 900;
        int scorePlayerThree = 400;
        int scorePlayerFour = 50;

        System.out.println(displayHighScorePosition(playerOneName, calculateHighScorePosition(scorePlayerOne)));
        System.out.println(displayHighScorePosition(playerTwoName, calculateHighScorePosition(scorePlayerTwo)));
        System.out.println(displayHighScorePosition(playerThreeName, calculateHighScorePosition(scorePlayerThree)));
        System.out.println(displayHighScorePosition(playerFourName, calculateHighScorePosition(scorePlayerFour)));

    }

    private static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        // -1 inherently means negative value or value not found
        return -1;
    }

    private static String displayHighScorePosition (String name, int position) {
        return name + " managed to get into position " + position + " on the high score table";
    }

    private static int calculateHighScorePosition(int score) {
        if (score>1000) {
            return 1;
        } else if ((score>500) && (score<1000)){
            return 2;
        } else if ((score>100) && (score<500)){
            return 3;
        } else {
            return 4;
        }
    }

}
