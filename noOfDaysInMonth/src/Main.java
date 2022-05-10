public class Main {
    public static void main(String[] args) {
        boolean leap = isLeapYear(4);
        System.out.println(leap);
        int days = getDaysInMonth(11, 2012);
        System.out.println(days);
    }

    public static boolean isLeapYear(int year){
        if(year < 0 || year > 9999){
            return false;
        }
        if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){

        int x = year;
        boolean leap = isLeapYear(x);
        if(month == 1 && leap){
            System.out.println("Feb 29");
        } else if(month == 1 && !leap){
            System.out.println("Feb 28");
        } else if(month == 0){
            System.out.println("january 31");
        }
        else if(month == 2){
            System.out.println("March 30");
        }
        else if(month == 3){
            System.out.println("April 31");
        }
        else if(month == 4){
            System.out.println("May 30");
        }
        else if(month == 5){
            System.out.println("June 31");
        }
        else if(month == 6){
            System.out.println("July 30");
        }
        else if(month == 7){
            System.out.println("August 31");
        }
        else if(month == 8){
            System.out.println("September 30");
        }
        else if(month == 9){
            System.out.println("October 31");
        }
        else if(month == 10){
            System.out.println("November 30");
        }
        else if(month ==11){
            System.out.println("December 31");
        }
        return 0;
    }
}
