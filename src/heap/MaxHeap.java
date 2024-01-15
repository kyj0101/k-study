package heap;


import tree.CompleteBinaryTree;
import tree.Node;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxHeap implements Heap{

    CompleteBinaryTree tree;

    public MaxHeap(Node root) {
        tree = new CompleteBinaryTree(root);
    }

    @Override
    public boolean add(int data) {
        Node newNode = tree.insert(data);
        sort(newNode);
        return true;
    }

    @Override
    public int remove() {
        int rootData = tree.getRoot()
                        .getData();

        LinkedList<Node> quLinkedList = (LinkedList) tree.getQueue();
        Node last = quLinkedList.pollLast();
        Node parent = last.getParent();

        if(parent.getLeft() == last) {
            parent.setLeft(null);
        }else {
            parent.setRight(null);
        }

        swap(tree.getRoot(), last);
        System.out.println(last);
        return rootData;
    }

    @Override
    public boolean sort(Node child) {

        Node parent = child.getParent();

        if(parent == null) {
            return false;
        }

        int newData = child.getData();
        int parentData = parent.getData();

        while (parentData < newData) {
            // data swap
            if(swap(parent, child)) {
                if(parent.getParent() != null) {
                    newData = parent.getData();
                    parentData = parent.getParent().getData();
                    child = parent;
                    parent = parent.getParent();
                } else {
                    break;
                }
            }
        }
        return true;
    }

    private boolean swap(Node parent, Node child) {

        int childTempData = child.getData();

        child.setData(parent.getData());
        parent.setData(childTempData);

        return true;
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "tree=" + tree +
                '}';
    }
}

