public class Main {
    public static void main(String[] args) {
        String result = printEqual(1, 6, 3);
        System.out.println(result);
    }

    public static String printEqual(int a, int b, int c){
        if( a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        }

        if(a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if(a != b && a != c && b != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither equal or different");
        }
        return "ignore";
    }
}
