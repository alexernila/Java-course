import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else{
                break;
            }
        }
            scanner.nextLine();
        System.out.println("Min= " + min + "  Max= " + max);
        scanner.close();
    }
}
