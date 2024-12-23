package lesson_4_vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, String licence, String color, int year, String ownerName, int insuranceNumber) {
        super(model, licence, color, year, ownerName, insuranceNumber, "Electric");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
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
}
