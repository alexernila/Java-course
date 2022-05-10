public class Main {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println(count);
            count++;
        }
        count = 3;
        do {
            System.out.println(count);
            count++;
        } while(count!=6);

        System.out.println(isEvenNumber(6));

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }


        }

        System.out.println("total even nums fount " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        while(number % 2 == 0){
            return true;
        }
        return false;
    }
}
