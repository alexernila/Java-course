public class Main {
    public static void main(String[] args) {
        printFactors(78);
    }
    public static void printFactors(int number) {
        if (number >= 1) {
            for (int i = number; i > 0; i--) {
                int factor = number / i;
                if (number % i == 0) {
                    System.out.println(factor);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
