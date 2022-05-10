public class Main {
    public static void main(String[] args) {
        boolean isLeapYear = isLeapYear(4);
        System.out.println(isLeapYear);
    }

    public static boolean isLeapYear(int year){
        if ((year > 0 && year <= 9999) && ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))){
            return true;
        } else if ((year > 0 && year <= 9999) && (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }

    }
}
