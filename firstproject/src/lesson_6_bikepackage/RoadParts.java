package lesson_6_bikepackage;

public interface RoadParts {
    final String terrain = "track_racing";

    void setTyreWidth(String newValue);
    void setPostHeight(String newValue);
    String getTyreWidth();
    String getPostHeight();
}
