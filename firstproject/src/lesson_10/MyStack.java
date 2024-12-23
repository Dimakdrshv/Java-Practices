package lesson_10;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStack <T> {
    private ArrayList<T> list;

    public MyStack() {
        list = new ArrayList<>();
    };

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public T peek() {
        return list.getLast();
    }

    public T pop() {
        if (!list.isEmpty())
            return list.removeLast();
        throw  new ArrayIndexOutOfBoundsException("WARNING: Выход за пределы стэка.");
    }

    public void push(T object) {
        list.addLast(object);
    }

    @Override
    public String toString() {
        String string = "Исходный стэк:\n" ;
        for (int i = 0; i < this.list.size(); i++) {
            string += this.list.get(i).toString() + " ";
        }
        return string;
    }

    public MyStack<T> deepCopy() {
        MyStack<T> newStack = new MyStack<>();
        for (T item : list) {
            if (item instanceof Cloneable) {
                newStack.push((T)cloneItem(item));
            } else {
                newStack.push(item);
            }
        }
        return newStack;
    }

    private Object cloneItem(Object item) {
        try {
            return item.getClass().getMethod("clone").invoke(item);
        } catch (Exception e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
