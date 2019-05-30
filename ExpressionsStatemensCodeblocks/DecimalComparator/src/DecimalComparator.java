public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces( double firstNum, double secondNum) {

        firstNum = (int) firstNum * 1000;
        secondNum = (int) secondNum * 1000;

        if (firstNum == secondNum){
            return true;
        }

        return false;
    }

}
