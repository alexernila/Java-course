import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        boolean check = areEqualByThreeDecimalPlaces(3.175, 3.175);
        System.out.println(check);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        DecimalFormat af = new DecimalFormat("#.###");
        String ax = af.format(a);
        double ca = Double.valueOf(ax);

        DecimalFormat bf = new DecimalFormat("#.###");
        String bx = bf.format(b);
        double cb = Double.valueOf(bx);

            if(ca == cb) {
                return true;
            } else {
                return false;
            }

    }
}
