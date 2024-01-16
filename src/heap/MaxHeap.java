package heap;


import tree.CompleteBinaryTree;
import tree.Node;

import java.util.LinkedList;

public class MaxHeap implements Heap{

    CompleteBinaryTree tree;

    public MaxHeap(Node root) {
        tree = new CompleteBinaryTree(root);
    }

    @Override
    public boolean add(int data) {
        Node newNode = tree.insert(data);
        sortBottom(newNode);
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
        sortTop(tree.getRoot());

        return rootData;
    }

    @Override
    public boolean sortTop(Node top) {

        if(top == null) {
            return false;
        }

        int parentData = top.getData();
        Node child = top.getLeft();
        Node left = top.getLeft();
        Node right = top.getRight();

        while (child != null) {

            int childData = child.getData();

            if(left != null && right != null) { // 왼쪽, 오른쪽 둘다 있으면 더 큰 값을 가져온다.

                if(left.getData() > right.getData()) {
                    childData = left.getData();
                    child = left;
                } else {
                    childData = right.getData();
                    child = right;
                }
            }

            if(childData > parentData) {
                swap(top, child);
                top = child;
                left = child.getLeft();
                right = child.getRight();
                child = left;
            }else {
                break;
            }
        }
        return true;
    }

    @Override
    public boolean sortBottom(Node child) {

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

