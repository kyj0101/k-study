package heap;


import java.util.ArrayList;

public class MaxHeap implements Heap{

    ArrayList<Node> dataList = new ArrayList<>();

    public MaxHeap(Node node) {
        dataList.add(node);
    }

    @Override
    public boolean add(int data) {
        Node node = dataList.get(dataList.size() - 1);
        int parent = node.getData();
        if(parent > data) {
            if(node.getLeft() == null) {
                node.setLeft(new Node(data));
            }else {
                node.setRight(new Node(data));
            }
        }

        return true;
    }

    @Override
    public boolean remove(int data) {
        return false;
    }

    public MaxHeap(ArrayList<Node> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "MaxHeap{" +
                "dataList=" + dataList +
                '}';
    }
}

