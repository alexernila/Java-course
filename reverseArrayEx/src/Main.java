import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,11,23};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed array is " + Arrays.toString(array));


//            Integer[] intArray = {10,20,30,40,50,60,70,80,90};
//
//            //print array starting from first element
//            System.out.println("Original Array:");
//            for(int i=0;i<intArray.length;i++)
//                System.out.print(intArray[i] + "  ");
//
//            System.out.println();
//
//            //print array starting from last element
//            System.out.println("Original Array printed in reverse order:");
//            for(int i=intArray.length-1;i>=0;i--)
//                System.out.print(intArray[i] + "  ");
//
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for(int i = 0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}
