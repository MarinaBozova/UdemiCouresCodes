public class PositivenegativeZero {

    public static void main(String[] args) {
        checkNumber(5);


    }
    public static void checkNumber(int number){

        if(number > 0){
            System.out.println("positive");
        }else if (number < 0){
            System.out.print("negtive");
        }else if (number == 0){
            System.out.print("zero");
        }
    }
}
