package com.company;

public class Main {

    public static void main(String[] args) {

        //int highScore = calculateScore(true, 800, 5, 100);
        // System.out.println("Yor final score was: " + highScore);

        // calculateScore(true, 10000,8,200);


        //Challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Johnny", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Marcus", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tommy", highScorePosition);


    }

    //public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

    //    if (gameOver){
    //        int finalScore = score + (levelCompleted * bonus);
    //        finalScore += 1000;
    //        return finalScore;
    //    }
    //    else {
    //        return -1;
    //    }
    // }


    //Challenge
    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        //if (playerScore >= 1000) {
        //    return 1;
        //} else if (playerScore >= 500) {
        //    return 2;
        //} else if (playerScore >= 100) {
        //    return 3;
        //}
//
        //return 4;
        int position = 4; // assuming position will be returned

        if (playerScore >= 1000){
            position = 1;
        }
        else if (playerScore >= 500){
            position = 2;
        }
        else if (playerScore >= 100){
            position = 3;
        }

        return position;
    }

}
