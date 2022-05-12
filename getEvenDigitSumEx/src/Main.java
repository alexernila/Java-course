public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(21212121));
    }

    public static int getEvenDigitSum(int number){
        int originalNumber = number;
        int lastDigit;
        int sum = 0;

        if(number >= 0) {
            while (number > 0){
                lastDigit = number % 10;
                if(lastDigit %2 == 0){
                    sum += lastDigit;
                }
                number /= 10;
            }
            if(originalNumber>=0) {
                System.out.println(originalNumber);
            }
            return sum;
                }
            return -1;
        }


}
