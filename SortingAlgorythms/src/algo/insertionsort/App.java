package algo.insertionsort;

public class App {

    public static void main(String[] args) {
        int[] myArray = insertionSort(new int[]{4, 7, 12, 55, 23, 88, 72, 9});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] insertionSort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int element = a[i]; // element variable contains the data we intend of bringing to the sorted array
            int j = i - 1; // j variable points to th index position of the lalst value in the sorted area
            while (j >= 0 && a[j] > element) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = element;
        }
        return a;
    }
}
