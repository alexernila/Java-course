public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temporaryNumber=number;
        while (number!=0){
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        if(reverse==temporaryNumber) return true;
        else return false;

    }
}
