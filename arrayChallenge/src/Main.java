import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed values was: " + myIntegers[i]);
        }


        printArray(sortArray(myIntegers));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has value: " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int sortedArray[]=new int[array.length];
        for(int i=0;i<sortedArray.length;i++)
        {
            sortedArray[i]=array[i];
        }
        int temp = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }


}
