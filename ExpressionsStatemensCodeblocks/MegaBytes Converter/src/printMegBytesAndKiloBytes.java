public class printMegBytesAndKiloBytes {

    public static int printMegaBytesAndKiloBytes(int kiloBites){

        if (kiloBites < 0){
            System.out.println("Invalid Value");
        }else {

            int megaBites = kiloBites / 1024;
            System.out.println(kiloBites + " KB = " + megaBites + " MB and " + (kiloBites % 1024) + " KB");
        }
        return kiloBites;
    }

}
