public class SpeedConverter {

    public static void main(String[] args){
        printConversion(44);
    }
   public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
           return -1;
    }
       return  Math.round(kilometersPerHour * 0.62);
}

    public static void printConversion(double kilometersPerHour){

     //   System.out.println(kilometersPerHour + " km/h = " + kilometersPerHour/1.60 + " m/h");
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
