import org.w3c.dom.Node;


public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }
    
    private boolean isEmpty(){
        return first == null;
    }

    public void insrtFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }


}
