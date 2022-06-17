package Algo.recursion;

public class Recursion {
    public static void main(String[] args) {
        reduceByOne(10);
        System.out.println(recursiveLinearSearch(new int[] {1, 2, 4, 5, 7, 8, 9, 91}, 0, 7));
    }

    public static void reduceByOne( int n){
        if(n>=0) {
            reduceByOne(n - 1);
        }

        System.out.println("completed call: " + n);
    }

    public static int recursiveLinearSearch(int[] a, int i, int x){

        if(i> a.length - 1){ // if true, x was not found in the array
            return -1;
        } else if (a[i] == x){
            return i;
        } else{
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i+1, x);
        }

//        int n = a.length;
//        if( i > n-1) {
//            return -1;
//        } else if(a[i] == x){
//            return i;
//        }
//        return recursiveLinearSearch(a, i+1, x);

    }
}
