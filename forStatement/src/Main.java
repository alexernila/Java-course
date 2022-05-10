public class Main {
    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2.0));

        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        for(int i = 2; i < 9; i++){
            System.out.println(calculateInterest(10000, i));
        }

        for(int i = 8; i > 1; i--){
            System.out.println(calculateInterest(10000, i));
        }
        int count = 0;
        for(int i=10; i<100; i++){
            if(isPrime(i) == true){
                count++;
                System.out.println(i);
                if(count == 3){
                    System.out.println("Exiting");
                    break;
                }

            }
        }
        int sum = 0;
        int count2 = 0;
        for(int i = 0; i <= 1000; i++) {
            if(i%3 == 0 && i%5==0){
                count2++;
                sum+=i;
                System.out.println(i);
            }
            if(sum == 45){
                System.out.println("exiting");
                break;
            }
        }
        System.out.println(count2);


    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i<= n/2; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
