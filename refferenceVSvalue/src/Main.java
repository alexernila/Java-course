import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = myValue;

        System.out.println("myValue = " + myValue);
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;
        System.out.println(myValue);
        System.out.println(anotherValue);

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("myArray after change = " + Arrays.toString(myArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8,};
        modifyArray(myArray);

        modifyArray(myArray);
        System.out.println("myArray after modifier = " + Arrays.toString(myArray));
        System.out.println("anotherArray after modifier = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};

    }
}
