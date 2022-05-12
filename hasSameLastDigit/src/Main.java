public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(48, 668, 928));
        System.out.println(isValid(89));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        System.out.println("Do they share the last digit?");
        if ((a >= 10 && a <= 1000) && (b>=10 && b<=1000) && (c>=10 && c<=1000)){
            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            int cLastDigit = c % 10;
            if((aLastDigit == bLastDigit) || (aLastDigit == cLastDigit) || (bLastDigit == cLastDigit)){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int num){
        System.out.println("is the number valid?");
        if(num>=10 && num <= 1000){
            return true;
        }
        return false;
    }
}
