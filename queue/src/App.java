public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(23);
        myQueue.insert(12);
        myQueue.insert(45);
        myQueue.view();
    }
}
