public class EqualSumChecker {
    public static boolean hasequalSum(int firstNum, int secondNum, int thirdNum){
        int sumOfBoth = firstNum + secondNum;
        if (sumOfBoth == thirdNum){
            return true;
        }
        return false;
    }
}
