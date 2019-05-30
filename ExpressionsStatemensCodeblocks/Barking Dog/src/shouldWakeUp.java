public class shouldWakeUp {

    public static boolean shouldWakeUp(boolean bark, int hourOfDay){

       if (bark == true){
           if (hourOfDay < 0 || hourOfDay > 23){
               return false;
           }
           else if (hourOfDay < 8 || hourOfDay > 22){
               return true;
           }
       }else {
           return false;
       }
    }
}
