package lesson_14;

public class Main {
    public static void main(String[] args) {
        StudentList firstStudentList = new StudentList();
        var iterator = firstStudentList.getIterator();
        while (iterator.hastNext())
            System.out.println(iterator.next());
    }
}
