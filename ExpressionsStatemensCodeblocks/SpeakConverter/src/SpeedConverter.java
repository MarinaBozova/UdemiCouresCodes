public class SpeedConverter {

    public static long toMilesPerHour(double kilometersperHour){
        if (kilometersperHour < 0){
            return -1;
        }

        return Math.round(kilometersperHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.print("Inalid Value");
        }else{
            long milesperhour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesperhour +
                    " mi/h");
        }
    }
}
