package src.java.geometry;

public class Circle implements Figure {
    private String color;
    private String border;
    private int radius;

    public Circle(String color, String border, int radius) {
        this.color = color;
        this.border = border;
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Периметр круга: " + perimeter() + "\n" +
                "Площадь круга: " + square() + "\n" +
                "Цвет фона: " + color + "\n" +
                "Цвет границ: " + border + "\n";
    }
}
