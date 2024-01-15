package heap;

import tree.Node;

import java.util.ArrayList;

public interface Heap {

    boolean add(int data);
    int remove(int data);
    boolean sort(Node node);

}
