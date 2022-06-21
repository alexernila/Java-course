package binarysearchtree;

public class App {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10,"ten");
        tree.insert(20,"twenty");
        tree.insert(30,"thirty");

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);
    }
}
