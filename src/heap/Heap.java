package heap;

import tree.Node;

import java.util.ArrayList;

public interface Heap {

    boolean add(int data);
    boolean remove(int data);

    boolean sort(Node node);

}
