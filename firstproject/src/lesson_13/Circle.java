package lesson_13;

public class Circle implements Shape {
    private String color;
    private Double x, y;

    public Circle(String color) {
        this.setColor(color);
        this.setX(0d);
        this.setY(0d);
    }

    public String getColor() {return this.color;}
    public Double getX() {return this.x;}
    public Double getY() {return this.y;}

    public void setColor(String color) {this.color = color;}
    public void setX(Double x) {this.x = x;}
    public void setY(Double y) {this.y = y;}

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color: " + this.color + ", x: " + this.x + ", y: " + this.y + "]");
    }
}
