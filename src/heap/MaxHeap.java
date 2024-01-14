package heap;


import tree.CompleteBinaryTree;
import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeap implements Heap{

    CompleteBinaryTree tree;

    Queue<Node> nodes = new LinkedList<>();

    public MaxHeap(Node root) {
        tree = new CompleteBinaryTree(root);
    }

    @Override
    public boolean add(int data) {
        Node newNode = tree.insert(data);
        nodes.add(newNode);
        sort(newNode);
        return true;
    }

    @Override
    public boolean remove(int data) {
        return false;
    }

    @Override
    public boolean sort(Node newNode) {
        Queue<Node> queue = tree.getQueue();
        Node parent = queue.peek();
        if(parent == null) {
            return false;
        }
        System.out.println("parent " + parent);
        if(parent.getData() < newNode.getData()) {
            int childData = newNode.getData();
            newNode.setData(parent.getData());
            parent.setData(childData);
        }
        return true;
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "tree=" + tree +
                '}';
    }
}

