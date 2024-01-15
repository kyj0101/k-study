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
        System.out.println(maxHeap);
        System.out.println(maxHeap.nodeList.toString());

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
