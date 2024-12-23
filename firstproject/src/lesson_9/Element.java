package lesson_9;

public class Element <T extends Comparable<T>> implements Comparable<Element<T>> {
    private T value;

    public Element(T value) {this.value = value;}

    public Element() {}

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Element<T> o) {
        return this.value.compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return "Element with" +
                " value " + value;
    }
}
