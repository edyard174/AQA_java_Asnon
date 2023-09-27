package src.java;

public class Main {
    public static void main(String[] args) {
        Box<Apple> ab = new Box<>();
        ab.add(new Apple());
        ab.add(new Apple());
        ab.add(new Apple());
        Box<Orange> ob = new Box<>();
        ob.add(new Orange());
        ob.add(new Orange());
        ob.add(new Orange());
        System.out.println("Вес " + ab.name + " равен: " + ab.getWeight());
        System.out.println("Вес " + ob.name + " равен: " + ob.getWeight());
        System.out.println("Вес " + ab.name + " и " + ob.name + " равны? " + ab.compare(ob));
        Box<Apple> ab2 = new Box<>();
        ab.pourTo(ab2);
        System.out.println("Вес " + ab.name + " равен: " + ab.getWeight());
        System.out.println("Вес " + ab2.name + " равен: " + ab2.getWeight());
    }
}
