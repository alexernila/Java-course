public class Main {
    public static void main(String[] args) {
        String calculate = printDaysAndYears(5729875);
    }

    public static String printDaysAndYears(long minutes){
        if ( minutes < 0 ){
            System.out.println("Invalid value");
        }
        else {
            long days = minutes/60/24;
            long years = days/365;
            System.out.println(minutes + " min = " + years + " years and " + days%365 + " days");
        }
        return "ignore";
    }
}
