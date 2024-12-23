package lesson_3_vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}
