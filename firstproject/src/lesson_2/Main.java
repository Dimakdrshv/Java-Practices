package lesson_2;

public class Main {
    public static void main(String[] args) {
        solution();
    }
    public static void solution() {
        Car car1 = new Car();
        System.out.println(car1.toString());
        Car car2 = new Car("toyota", "A", "red", 2001);
        System.out.println(car2.toString());
        Car car3 = new Car("opel", 2014) {
            @Override
            public String toString() {
                return "Car: " +
                        "model= " + model + ' ' +
                        ", year= " + year;
            }
        };
        System.out.println(car3.toString());
        System.out.println(car3.carAge());
    }
}