public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15, 25));
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        int greatest = 0;

        if(first >= 10 && second >= 10){

            for(int i = 1; ((i <= first) && (i <=second)); i++ ){
                if((first % i == 0) && (second % i == 0)){
                    greatest = i;
                }
            }
            System.out.println(greatest);

            return greatest;

        } else
            System.out.println("-1");
        return -1;
    }
}
