package heap;

import java.util.ArrayList;
import java.util.List;

// https://cdragon.tistory.com/19
public class BinaryTree {

    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void insert(int data) {
        List<Node> preorder = preorder();
        if(preorder.size() > 2) {
            Node node = preorder.get(preorder.size() - 2);
            System.out.println(" -2 " + node);
            System.out.println(" data " + data);
        }

        insertNode(this.root, null, data);
    }

    private boolean insertNode(Node node, Node parent, int data) {
        System.out.println("Node :  " + node);
        System.out.println("data : " + data);
        if(node == null) {
            return false;
        }

        if(node.getLeft() == null) {
            node.setLeft(new Node(data));
            return true;
        }

        if(node.getRight() == null) {
            node.setRight(new Node(data));
            return true;
        }


        if(!insertNode(node.getLeft(), node, data)) {
            insertNode(node.getRight(), node, data);
        }

        return true;
    }

    public List<Node> preorder() {
        return this.preorderTree(this.root, new ArrayList<>());
    }

    private List<Node> preorderTree(Node node, List<Node> visited) {
        if(node == null) {
            return visited;
        }

        visited.add(node);
        preorderTree(node.left, visited);
        preorderTree(node.right, visited);

        return visited;
    }

    public List<Integer> preorderData() {
        return this.preorderTreeData(this.root, new ArrayList<>());
    }

    private List<Integer> preorderTreeData(Node node, List<Integer> visited) {
        if(node == null) {
            return visited;
        }

        visited.add(node.data);
        preorderTreeData(node.left, visited);
        preorderTreeData(node.right, visited);

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










}
