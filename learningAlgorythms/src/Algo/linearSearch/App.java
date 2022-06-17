package Algo.linearSearch;

public class App {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 9, 11, 15, 23, 29, 45};
        System.out.println(linearSearch(a, 9));
        System.out.println(binarySearch(23, a));
        System.out.println(recursiveBinarySearch(a, 0, a.length-1, 4));
    }

    public static int linearSearch(int[] a, int x){
        for(int i = 0; i< a.length; i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int x, int[] a){
        int p = 0;
        int r = a.length - 1;

        while(p<=r){
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            }
            if(a[q] >x){
                r = q-1;
            } else {
                p = q +1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x){
        if(p>r){
            return -1;
        }else{
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            } else if(a[q] > x){
                return recursiveBinarySearch(a, p, q-1, x);
            } else{
                return recursiveBinarySearch(a, q+1, r, x);
            }
        }
    }
}
