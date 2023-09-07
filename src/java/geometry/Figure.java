package src.java.geometry;

public interface Figure {
    default double perimeter(int radius) {
        return 2 * Math.PI * radius;
    }
    double perimeter();
    double square();
}
