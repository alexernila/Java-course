public class Main {
    public static void main(String[] args) {
        String result = getDurationString(556, 23);
        System.out.println(result);
        System.out.println(getDuretionString(523));
    }

    public static String getDurationString(int minutes, int seconds){
        if ( minutes < 0 || (seconds < 0 || seconds > 59)){
            System.out.println("Invalid value");
        } else {
            return ( minutes/60 + " h " + minutes%60 + " m " + seconds + " s" );
        }
    return "Ignore this";}

    public static String getDuretionString(int seconds){
        if(seconds >= 0){
            int minutes = seconds/60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return "Invalid Value";
    }


}
