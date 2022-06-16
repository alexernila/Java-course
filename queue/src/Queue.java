public class Queue {

    private int maxSize; // initializes the set number of slots
    private long[] queueArray; //slots to mantain data
    private int front; // this will be the index position for the element in the front
    private int rear; // index psoition for the element at the back of the line
    private int nItems; // counter to maintain the number of items in the queue

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;  // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; // we do't have elements in the array yet
    }

    public void insert(long j){
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove(){
        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0; // we can set front back to the 0th index so that we can utilize the array again
        }
        nItems--;
        return temp;
    }

    public long peakFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public void view(){
        System.out.println("[");
        for(int i = 0; i < queueArray.length; i++){
            System.out.println(queueArray[i] + " ");
        }
        System.out.println("]");
    }

}
