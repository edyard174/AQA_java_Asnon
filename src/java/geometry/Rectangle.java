package src.java.geometry;

public class Rectangle implements Figure {
    private String color;
    private String border;
    private int a;
    private int b;

    public Rectangle(String color, String border, int a, int b) {
        this.color = color;
        this.border = border;
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double square() {
        return a * b;
    }
    @Override
    public String toString() {
        return "Периметр прямоугольника: " + perimeter() + "\n" +
                "Площадь прямоугольника: " + square() + "\n" +
                "Цвет фона: " + color + "\n" +
                "Цвет границ: " + border + "\n";
    }
}
