package lesson_7;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled) {
        super(color, filled);
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) throws IllegalTriangleException {
        super(color, filled);
        if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
            throw new IllegalTriangleException("Неверно введены стороны треугольника.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double halfP = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(halfP * (halfP - this.side1) * (halfP - this.side2) * (halfP - this.side3));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString() {
        return super.toString() + "\nПервая сторона = " + this.getSide1() +
                ";\nВторая сторона = " + this.getSide2() + ";\nТретья сторона = " + this.getSide3() +
                ";\nПлощадь треугольника = " + this.getArea() + ";\nПериметр треугольника = " + this.getPerimeter() + ".";
    }
}
