package lesson_9;

import java.util.ArrayList;

public class Circle implements Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "The largest circle with " +
                "radius = " + radius;
    }
    public static void findLargestCircle (ArrayList<Circle> arrayList) {
        Circle largestCircle = arrayList.get(0);

        for (Circle circle : arrayList) {
            if (circle.compareTo(largestCircle) > 0) largestCircle = circle;
        }

        System.out.println(largestCircle.toString());
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }
}
