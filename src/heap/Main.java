package heap;

import tree.Node;

public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(new Node(1));
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(0);
        maxHeap.add(20);
        maxHeap.add(8);
        maxHeap.remove();
        System.out.println(maxHeap);

        MinHeap minHeap = new MinHeap(new Node(5));
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(6);
        minHeap.add(2);
        minHeap.add(4);
        minHeap.add(1);
        System.out.println(minHeap);






//        Node node = new Node(12);
//        CompleteBinaryTree completeBinaryTree = new CompleteBinaryTree(node);
//        completeBinaryTree.insert(2);
//        completeBinaryTree.insert(10);
//        completeBinaryTree.insert(6);
//        completeBinaryTree.insert(16);
//        completeBinaryTree.insert(4);
//        completeBinaryTree.insert(17);
//        completeBinaryTree.insert(5);
//        System.out.println("root : " +  completeBinaryTree.root.toString());
//        System.out.println("preorder : " + completeBinaryTree.preorderData());
//        System.out.println("inorder : " + completeBinaryTree.inorder());
//        System.out.println("postorder : " + completeBinaryTree.postorder());


    }
}
