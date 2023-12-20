package stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Stack {
    private Object[] elementData;
    private int top = -1;

    public Stack() {}

    public Stack(Object[] elementData) {
        this.elementData = elementData;
        this.top = (elementData.length - 1);
    }

    public Stack(int length) {
        elementData = new Object[length];
    }

    public void push(Object data) {
        if(elementData == null) {
            elementData = new Object[]{data};
            return;
        }

        if(isFull()) {
            Object[] newElementData = new Object[elementData.length + 1];
            for (int i = 0; i < elementData.length; i++) {
                newElementData[i] = elementData[i];
            }
            newElementData[elementData.length] = data;
            top = elementData.length;
            elementData = newElementData;
            return;
        }

        elementData[top + 1] = data;
        top = top + 1;
    }

    public Object pop() {
        if(elementData == null) {
            throw new NullPointerException();
        }

        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        Object lastData = elementData[top];
        elementData[top] = null;
        top = top - 1;

        return lastData;
    }

    public Object peek() {
        if(elementData == null) {
            throw new NullPointerException();
        }

        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        return elementData[top];
    }

    public boolean isFull() {
        return this.top == (elementData.length - 1);
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
