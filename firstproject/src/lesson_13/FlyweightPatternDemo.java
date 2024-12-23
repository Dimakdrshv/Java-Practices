package lesson_13;

public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green",
            "Blue", "White", "Black" };
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.getShape(colors[0]);
        circle.setX(5d);
        circle.setY(5d);
        circle.draw();
        Circle circle_1 = (Circle) ShapeFactory.getShape(colors[0]);
        circle_1.setX(8d);
        circle_1.setY(8d);
        circle_1.draw();
    }
}
