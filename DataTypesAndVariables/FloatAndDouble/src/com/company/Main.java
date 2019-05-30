package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3f;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge
        double pounds = 200d;
        double poundsToKilograms = pounds * 0.45359237;

        System.out.println("To kilograms: " + poundsToKilograms);

    }
}
