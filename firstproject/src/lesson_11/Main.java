package lesson_11;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        StackOnQueue<Integer> stackOnQueue = new StackOnQueue<>();
        stackOnQueue.push(1);
        stackOnQueue.push(2);
        stackOnQueue.push(3);
        stackOnQueue.push(4);
        stackOnQueue.push(5);
        System.out.println(stackOnQueue.toString());
        System.out.println(stackOnQueue.top());
        System.out.println(stackOnQueue.pop());
        System.out.println(stackOnQueue.top());
        System.out.println(stackOnQueue.isEmpty());
        System.out.println(stackOnQueue.toString());

    }
}
