package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //    if (score < 5000) {
        //        System.out.println("Your score was less than 5000 but greater than 1000");
        //    }
        //    else if(score < 1000) {
        //        System.out.println("Your score was less than 1000");
        //    }
        //    else {
        //        System.out.println("Got here");
        //    }

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore);
            }

        //Challenge
       //boolean secondGameOver = true;
       //int secondScore = 10000;
       //int secondLevelCompleted = 8;
       //int secondBonus = 200;

       //if (secondGameOver) {
       //    int secondFinaleScore = secondScore + (secondLevelCompleted * secondBonus);
       //    System.out.println("Your second final score was: " + secondFinaleScore);
       //}

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
