package com.company;

public class Main {

    public static void main(String[] args) {
	printEqual(-1,-1,-1);
    }
    public static void printEqual (int firstNum, int secondNum, int thirdNum){
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0){
            System.out.println("Invalid value");
        }else if (firstNum == secondNum && secondNum == thirdNum){
            System.out.println("All numbers are equal");
        }else if (firstNum != secondNum && secondNum != thirdNum){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
