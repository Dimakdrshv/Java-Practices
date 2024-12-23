package lesson_3_vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;

    {
        this.engineType = "Electric";
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }
}
