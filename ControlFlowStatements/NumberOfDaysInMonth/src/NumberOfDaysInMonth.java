public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year / 4 == 0){
                return true;
            }else if (year / 100 == 0 || year / 400 == 0){
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){

        if (isLeapYear(year) == true){
            if (year >= 9999 && year < 1){
                return -1;
            }else if (month < 1 && month > 12) {
                return -1;
            
            }else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                        return 30;
                    // break;
                    case 2:
                        return 29;
                    //  System.out.println("29");
                    // break;

                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                        return 31;
                    // System.out.println("31");
                    //break;
                }
            }
        }
        if (month == 2){
            return 28;
        }else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11){
            return 30;
        }
        return 31;
    }
}
