package algo.mergeSort;

public class MergeSort {

    public static void sort(int inputArray[]){
        sort(inputArray, 0, inputArray.length-1);
    }

    public static void sort(int inputArray[], int start, int end){
        if(end <= start){
            return; // we're done traversing the array
        }

        int mid = (start+end)/2;
        sort(inputArray, start, mid); //sort left halp
        sort(inputArray, mid+1, end); // sort left halp
        merge(inputArray, start, mid, end); //merge sorted resultss into input array
    }

    public static void merge(int inputArray[], int start, int mid, int end) {
        int tempArray[] = new int[end - start + 1];
        // index counter for the left and right side of the array
        int leftSlot = start;
        int rightSlot = mid + 1;
        int k = 0; // index position counter

        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k + 1;
        }
        //when it gets to here that means the above loop has finished
        //so both left and right side of the array can be considered sorted

        if (leftSlot <= mid) {
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        // copy over the tempArray into the appropriate slots of the inputArray
        for(int i = 0; i<tempArray.length; i++){
            inputArray[start+i] = tempArray[i];
        }
    }
}
