package heap;

public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(new Node(15));
        maxHeap.add(9);
        maxHeap.add(5);
        ///maxHeap.add(7);
        //System.out.println(maxHeap);

        Node node = new Node(12);
        BinaryTree binaryTree = new BinaryTree(node);
        binaryTree.insert(2);
        binaryTree.insert(10);
        binaryTree.insert(6);
        binaryTree.insert(16);
        //binaryTree.insert(4);
        System.out.println("root : " +  binaryTree.root);
        System.out.println("preorder : " + binaryTree.preorderData());
        System.out.println("inorder : " + binaryTree.inorder());
        System.out.println("postorder : " + binaryTree.postorder());
    }
}
