package heap;

import tree.Node;

import java.util.ArrayList;

public interface Heap {

    boolean add(int data);
    int remove();

    boolean sort(Node node);

}
