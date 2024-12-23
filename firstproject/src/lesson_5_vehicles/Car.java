package lesson_5_vehicles;

public class Car extends Vehicle {
    @Override
    public String vehicleType() {
        return "Car";
    }

    public Car(String model, String licence, String color, int year, String ownerName, int insuranceNumber, String engineType) {
        this.setModel(model);
        this.setLicence(licence);
        this.setColor(color);
        this.setYear(year);
        this.setOwnerName(ownerName);
        this.setInsuranceNumber(insuranceNumber);
        this.engineType = "Combustion";
    }

}

