public class Stack {
    private int maxSize;
    private long[] stackArray; // container that stores the list of items
    private int top; // represents index position of last item

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        top++;
        stackArray[top] = j;
    }

    public long pop(){
        int oldTop = top; //making a copy
        top--;
        return stackArray[oldTop];
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }

}
