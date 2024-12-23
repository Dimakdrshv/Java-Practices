package lesson_14;

public class StudentList {
    private static final String names[] = {"John", "Jack", "Paul", "Mary", "Dalton"};

    public Iterator<String> getIterator() {
        return new StudentListIterator();
    }
    private class StudentListIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hastNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
