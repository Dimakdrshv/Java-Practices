package lesson_3_app;

import lesson_3_vehicles.Car;
import lesson_3_vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setEngineType("diesel");
        car.setInsuranceNumber(331410016);
        car.setOwnerName("Oliver");

        ElectricCar electricCar = new ElectricCar();

        electricCar.setInsuranceNumber(134586594);
        electricCar.setOwnerName("David");
        electricCar.setBatteryCapacity(92);

        printInfo(car);
        printInfo(electricCar);
    }

    public static void printInfo(Car car) {
        if (car instanceof ElectricCar electricCar) {
            System.out.println(electricCar.getEngineType()
                    + "\n" + electricCar.getInsuranceNumber()
                    + "\n" + electricCar.getOwnerName()
                    + "\n" + electricCar.getBatteryCapacity()
                    + "%" + "\n"
            );
        }
        else {
            System.out.println(car.getEngineType()
                    + "\n" + car.getInsuranceNumber()
                    + "\n" + car.getOwnerName()
                    + "\n"
            );
        }
    }
}
