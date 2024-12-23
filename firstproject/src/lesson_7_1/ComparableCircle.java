package lesson_7_1;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }
    public static ComparableCircle max(ComparableCircle obj1, ComparableCircle obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }
}
