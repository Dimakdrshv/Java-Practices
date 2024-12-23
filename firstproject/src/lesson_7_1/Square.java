package lesson_7_1;

import java.util.Scanner;

public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this.side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны!");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
