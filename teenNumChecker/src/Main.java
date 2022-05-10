public class Main {
    public static void main(String[] args) {
        boolean teen1 = hasTeen(24, 12, 77);
        System.out.println(teen1);
        boolean teen2 = isTeen(17);
        System.out.println(teen2);
    }

    public static boolean hasTeen(int a, int b, int c){
        if( (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isTeen(int age){
        if(age >= 13 && age <= 19){
            return true;
        } else {
            return false;
        }
    }
}
