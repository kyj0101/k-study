package heap;

import tree.Node;

public interface Heap {

    boolean add(int data);
    int remove();
    boolean sortTop(Node node);
    boolean sortBottom(Node node);

}
