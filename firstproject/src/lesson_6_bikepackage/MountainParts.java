package lesson_6_bikepackage;

public interface MountainParts {
    final String TERRAIN = "off_road";

    void setSuspension(String newValue);
    void setType(String newValue);

    String getSuspension();
    String getType();
}
