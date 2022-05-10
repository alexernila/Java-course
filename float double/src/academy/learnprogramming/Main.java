package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min float value is " + myMinFloatValue);
        System.out.println("My max float value is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My min Double value is " + myMinDoubleValue);
        System.out.println("My max Double value is " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double pound = 200;
        double kilo = 0.45359237 * pound;
        System.out.println(kilo);


    }
}
