public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 45));
    }

    public static boolean hasSharedDigit(int a, int b){
        if((a >=0 && a <=99) && (b >=0 && b <= 99) ){
            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            a/=10;
            b/=10;
            int aFirstDigit = a;
            int bFirstDigit = b;
            return((aFirstDigit == bFirstDigit) || (aFirstDigit == bLastDigit) || (aLastDigit == bFirstDigit ) || (aLastDigit == bLastDigit));
        }
        return false;
    }

}
