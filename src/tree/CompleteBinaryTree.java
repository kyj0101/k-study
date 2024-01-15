package tree;

import java.util.*;

// https://cdragon.tistory.com/19
// https://www.geeksforgeeks.org/complete-binary-tree/
public class CompleteBinaryTree {

    Node root;

    Queue<Node> queue = new LinkedList<>();

    public CompleteBinaryTree(Node root) {
        this.root = root;
        queue.add(root);
    }

    public Node getRoot() {
        return root;
    }

    public Queue<Node> getQueue() {
        return queue;
    }

    public Node insert(int data) {

        boolean complete = false;
        Node parent = queue.peek();
        Node child = new Node(data);

        while (!complete) {

            if(parent == null) {
                return null;
            }

            if(parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                queue.add(child);
                complete = true;

            }else if(parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                queue.add(child);
                complete = true;

            } else {
                queue.remove();
                parent = queue.peek();
            }
        }

        return child;
    }

    public List<Integer> preorderData() {
        return this.preorderTree(this.root, new ArrayList<>());
    }

    private List<Integer> preorderTree(Node node, List<Integer> visited) {
        if(node == null) {
            return visited;
        }

        visited.add(node.data);
        preorderTree(node.left, visited);
        preorderTree(node.right, visited);

        return visited;
    }

    public List<Integer> inorder() {
        return this.inorderTree(this.root, new ArrayList<>());
    }
    private List<Integer> inorderTree(Node node, List<Integer> visited) {
        if(node == null) {
            return visited;
        }

        inorderTree(node.left, visited);
        visited.add(node.data);
        inorderTree(node.right, visited);

        return visited;
    }

    public List<Integer> postorder() {
        return this.postorderTree(this.root, new ArrayList<>());
    }

    private List<Integer> postorderTree(Node node, List<Integer> visited) {
        if(node == null) {
            return visited;
        }

        postorderTree(node.left, visited);
        postorderTree(node.right, visited);
        visited.add(node.data);

        return visited;
    }

    @Override
    public String toString() {
        return "CompleteBinaryTree{" +
                "root=" + root +
                '}';
    }
}
