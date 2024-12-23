package lesson_10;

import java.util.ArrayList;

public class MyStackAL <T> extends ArrayList<T> {
    private ArrayList<T> list;

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

    @Override
    public String toString() {
        String string = "MyStack: " ;
        for (int i = 0; i < this.list.size(); i++) {
            string += this.list.get(i).toString() + " ";
        }
        return string;
    }
}
