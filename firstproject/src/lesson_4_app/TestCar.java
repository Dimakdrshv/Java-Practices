package lesson_4_app;

import lesson_4_vehicles.Car;
import lesson_4_vehicles.ElectricCar;
import lesson_4_vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Tesla", "B", "red",
                        2012, "Oliver", 1231431431);

        Vehicle car = new Car("BMW-i8", "B", "green",
                2015, "David", 533113454, "diesel");

        printInfo(electricCar);
        printInfo(car);
    }
    public static void printInfo(Vehicle vehicle) {
        if (vehicle instanceof ElectricCar electricCar) {
            electricCar.setBatteryCapacity(92);
            electricCar.setColor("black");
            electricCar.setInsuranceNumber(133144);
            electricCar.setLicence("B1");
            electricCar.setYear(2020);
            electricCar.setOwnerName("Андрюха");
            System.out.println(electricCar.toString());
        } else if (vehicle instanceof Car car) {
            car.setColor("red");
            car.setInsuranceNumber(5415432);
            car.setLicence("B1");
            car.setYear(2019);
            car.setOwnerName("Натаха");
            car.setEngineType("Самогон");
            car.setModel("Жигули");
            System.out.println(car.toString());
        }
    }
}
