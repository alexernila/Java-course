public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println(newScore);
//        calculateScore(100);
//        calculateScore();

        double centi = calcFeetAndInchesToCemtimeters(7, 5);
        System.out.println(centi);

        double feet = calcFeetAndInchesToCemtimeters(48);
        System.out.println(feet);
    }

//    public static int calculateScore(String playerName, int score){
//        System.out.println("player " + playerName + " scored " + score);
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score){
//        System.out.println("Unnamed player " + " scored " + score);
//        return score * 1000;
//    }
//
//    public static int calculateScore(){
//        System.out.println("No player, no score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCemtimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            System.out.println(feet*30.48 + inches*2.54 + " centimeters");
        } else {
            return -1;
        }
    return -1;
    }

    public static double calcFeetAndInchesToCemtimeters(double inches){
        if(inches>=0){
            System.out.println(inches/12 + " feet");
        }
        return -1;
    }

}
