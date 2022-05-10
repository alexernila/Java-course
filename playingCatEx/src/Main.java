public class Main {
    public static void main(String[] args) {
        boolean isPlaying = isCatPlaying(false, 32);
        System.out.println(isPlaying);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (!summer && (temperature >= 25 && temperature <= 35)){
            return true;
        } else if(summer && (temperature >= 25 && temperature <= 45)){
            return true;
        }
        return false;
    }
}
