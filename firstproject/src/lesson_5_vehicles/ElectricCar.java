package lesson_5_vehicles;

import lesson_5_vehicles.Car;

public class ElectricCar extends Car implements ElectricVehicle {

    private int batteryCapacity;

    public ElectricCar(String model, String licence, String color, int year, String ownerName, int insuranceNumber, int batteryCapacity) {
        super(model, licence, color, year, ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + ", batteryCapacity = " + this.batteryCapacity + "%";
    }

    @Override
    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
