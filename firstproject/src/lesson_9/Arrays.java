package lesson_9;

import java.util.*;

public class Arrays {

    public <T> ArrayList<T> setArrayList (ArrayList<T> arrayList) {

        List<T> list = new ArrayList<>();

        for (T item : arrayList) {
            if (!list.contains(item)) list.add(item);
        }

        return (ArrayList<T>) list;
    }

    public <T> int searchItem (ArrayList<T> arrayList, T item) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == item) return i;
        }

        return -1;

    }

    public <T> void showArrayList (ArrayList<T> arrayList) {
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + "\t");
        System.out.println();
    }
}
