package lesson_2;

import java.util.Objects;

public class Car {
    String model, license, color;
    int year;
    final int CURRENT_YEAR = 2024;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "no info";
        this.license = "no info";
        this.color = "no info";
        this.year = 0;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model= " + model + ' ' +
                ", license= " + license + ' ' +
                ", color= " + color + ' ' +
                ", year= " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int carAge() {
        return CURRENT_YEAR - this.year;
    }
}