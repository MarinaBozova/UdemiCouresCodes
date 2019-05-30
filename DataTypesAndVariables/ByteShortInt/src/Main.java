public class Main {

    public static void main(String[] args){

        // integer has a width of 32
        int myValue = 1000;
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = ( myMinValue/2);
        System.out.println("myTotal"+ myTotal);

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myByteValue"+ myNewByteValue);

        //short has a width of 16
        short myShortValue = -32767;

        //long has a width of 64
        long myLongValue = 1000L;

        //Challenge
        byte valueByte = 100;
        short valueShort = 30000;
        int valueInt = 100000;
        long valueLong = 50000 + (10 * (valueByte + valueShort + valueInt));

        System.out.println("The long number is: " + valueLong);







    }
}
