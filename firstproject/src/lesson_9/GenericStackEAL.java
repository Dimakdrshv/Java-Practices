package lesson_9;

import java.util.ArrayList;

public class GenericStackEAL<T> extends ArrayList<T> {

    public GenericStackEAL () {}
    public int getSize() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek() {
        return super.getLast();
    }

    public void push(T element) {
        super.addLast(element);
    }

    public T pop() {
        return super.removeLast();
    }
}
