package lesson_9;

import java.util.Arrays;

public class GenericStack<E> {
    private E[] array;
    private int size;
    private int temp;

    public GenericStack (int size) {
        this.array = (E[]) new Object[size];
        this.size = size;
        this.temp = 0;
    }
    public int getSize() {
        return this.size;
    }
    public E peek() {
        if (this.temp == 0 && this.temp < this.size) return this.array[temp];
        else if (this.temp != 0 && this.temp < this.size) return this.array[temp - 1];
        else throw new ArrayIndexOutOfBoundsException("Массив пуст");
    }
    public void push(E o) {
        if (this.temp < this.size) {
            this.array[temp] = o;
            ++temp;
        } else {
            E[] copyArray = (E[]) new Object[this.getSize() * 2];
            for (int i = 0; i < this.size; i++) {
                copyArray[i] = this.array[i];
            }
            this.array = copyArray;
            this.size *= 2;
            this.array[temp] = o;
            ++temp;
        }
    }
    public E pop() {
        if (this.getSize() != 0) {
            E o = this.array[this.getSize() - 1];
            --this.size;
            E[] copyArray = (E[]) new Object[this.getSize()];
            for (int i = 0; i < size; i++) {
                copyArray[i] = this.array[i];
            }
            this.array = copyArray;
            return o;
        }
        else throw new ArrayIndexOutOfBoundsException("Массив пуст");
    }
    public boolean isEmpty() {
        return this.getSize() == 0;
    }
    @Override
    public String toString() {
        return "Стэк: " + Arrays.toString(this.array);
    }
}
