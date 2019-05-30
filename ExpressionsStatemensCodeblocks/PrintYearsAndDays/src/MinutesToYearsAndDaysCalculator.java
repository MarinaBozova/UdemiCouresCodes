public class MinutesToYearsAndDaysCalculator {
    public  static  final String INVALID_VALUE_MESSAGE = "Invalid value";
    public  static  void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365;



        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}
