package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);


	int value = 1;
	if  (value == 1){
        System.out.println("Value was 1");
    }else if (value == 2){
        System.out.println("Value was 2 ");
    }else {
        System.out.println("Value was neither 1 or 2");
    }
	int switchValue = 1;

	switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3, or a 4, or a 5");
            System.out.println("Actually it was " + switchValue);
            break;

        default:System.out.println("Value was not 1 or 2");
            break;
    }
    //Challenge
        char letter = 'A';
	switch (letter){
        case 'A':
            System.out.println("The character was A");
            break;
        case 'B':
            System.out.println("The character was B");
            break;
        case 'C': case 'D':
            System.out.println("The character was " + letter + "found");
            break;

        default:
            System.out.println("Not found");
            break;
    }
    //Explanations
    String month = "January";
	switch (month.toLowerCase()){
        case "january":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure ");
            break;
    }

    }
    private static void printDayOfTheWeek (int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        //Bonus challenge
        if (day == 0){
            System.out.println("Sunday");
        }else if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5) {
            System.out.println("Friday");
        }else if (day == 6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day");
        }

    }
}
