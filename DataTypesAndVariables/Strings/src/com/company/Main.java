package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";

        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);
        myString = myString = "\u00a9 2015";

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is: " + numberString);

        String lastString = "18";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to: " + lastString);

        double doubleNumber = 124.14;
        lastString = lastString + doubleNumber;
        System.out.println("The result is: " + lastString);
    }
}
