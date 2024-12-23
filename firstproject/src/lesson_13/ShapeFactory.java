package lesson_13;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle with color: " + color + ".");
            return circle;
        }
        else {
            System.out.println("Getting circle with color: " + color + " from circleMap.");
            return circle;
        }
    }
}
