public class Main {
    public static void main(String[] args) {
        boolean checker = hasEqualSum(6, 2, 3);
        System.out.println(checker);
    }

    public static boolean hasEqualSum(int num1, int num2, int sum){
        if (num1 + num2 == sum) {
            return true;
        } else {
            return false;
        }
    }
}
