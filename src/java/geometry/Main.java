package src.java.geometry;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle("Синий", "Черный", 5);
        System.out.println(circle);
        Figure rectangle = new Rectangle("Белый", "Красный", 10, 15);
        System.out.println(rectangle);
        Figure triangle = new Triangle("Зелёный", "Желтый", 15, 10, 10);
        System.out.println(triangle);
    }
}
