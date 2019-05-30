package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("The result is: " + result);

        int prevResult = result;

        result = result - 1;
        System.out.println("Result: " + result);

        prevResult = result;
        result = result * 10;
        System.out.println("Result: " + result);

        prevResult = result;
        result = result % 3;
        System.out.println("Result: " + result);
        result++;
        System.out.println("Result: " + result);
        result--;
        System.out.println("Result: " + result);
        result += 2;
        System.out.println("Result: " + result);
        result -= 3;
        System.out.println("Result: " + result);
        result *= 10;
        System.out.println("Result: " + result);
        result /= 10;
        System.out.println("Result: " + result);

        boolean isAlien = false;

        if (isAlien == true){
            System.out.println("It is not an alien!");
        }
        else {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        if (topScore != 100){
            System.out.println("You got high score!");
        }

        if (topScore <= 100){
            System.out.println("You got high score!");
        }

        if (topScore >= 100){
            System.out.println("You got high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore)&& topScore < 100){
            System.out.println("Greater top score and less than a 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests is true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar = true){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean waCar = isCar ? true : false;
        System.out.println("This is true");

        //Challenge
        double firstNum = 20;
        double secondNum = 80;
        double sum = (firstNum + secondNum) * 25;
        sum %= 40;

        if (sum <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
