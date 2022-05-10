public class Main {
    public static void main(String[] args) {
        int value = 5;
        printDayOfTheWeek(5);



        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually is was a " + value);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;

        }

        char letter = 'C';
        switch(letter){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Not found");
        }

        String month = "March";
        switch(month){
            case "January": case "February": case "March": case "April":
                System.out.println("Month is " + month);
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
    // challenge
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }
}

