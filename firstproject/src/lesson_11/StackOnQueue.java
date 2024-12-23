package lesson_11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue <T> {
    private Queue<T> queue_1 = new LinkedList<>();
    private Queue<T> queue_2 = new LinkedList<>();


    public void push(T element) {
        queue_1.add(element);
    }

    public T top() {
        while (queue_1.size() != 1)
            queue_2.add(queue_1.poll());
        T element = queue_1.poll();
        while (!queue_2.isEmpty())
            queue_1.add(queue_2.poll());
        queue_1.add(element);
        return element;
    }

    public T pop() {
        while (queue_1.size() != 1)
            queue_2.add(queue_1.poll());
        T element = queue_1.poll();
        while (!queue_2.isEmpty())
            queue_1.add(queue_2.poll());
        return element;
    }

    public boolean isEmpty() {
        return queue_1.isEmpty();
    }

    @Override
    public String toString() {
        return "StackOnQueue" + " " + queue_1;
    }
}
