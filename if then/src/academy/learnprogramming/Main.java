package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not alien");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("Top score is 100");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore > 50){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //challenge
        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100;
        System.out.println(c);
        System.out.println((c % 40));

        boolean d = (c % 40) == 0 ? true : false;
        System.out.println(d);

        if (d != true) {
            System.out.println("Got some remainer");
        }




    }
}
