package src.java.geometry;

public class Triangle implements Figure {
    private String color;
    private String border;
    private int a;
    private int b;
    private int c;

    public Triangle(String color, String border, int a, int b, int c) {
        this.color = color;
        this.border = border;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double square() {
        double d = (a + b + c) / 2.0;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }
    @Override
    public String toString() {
        if (a + b < c || a + c < b || b + c < a) {
            return "Это не является треугольником!";
        }
        return "Периметр треугольника: " + perimeter() + "\n" +
                "Площадь треугольника: " + square() + "\n" +
                "Цвет фона: " + color + "\n" +
                "Цвет границ: " + border + "\n";
    }
}
