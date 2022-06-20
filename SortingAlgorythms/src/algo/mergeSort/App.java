package algo.mergeSort;

public class App {
    public static void main(String[] args) {
        int[] inputArray = {4, 7, 12, 55, 23, 88, 72, 9, 19, 2, 0, 13, 21};
        MergeSort sorter = new MergeSort();

        sorter.sort(inputArray);

        for(int i = 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    }
}
