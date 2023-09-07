package src.java.animal;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Myrka", 10);
        cats[1] = new Cat("Barsic", 20);
        cats[2] = new Cat("Vasa", 22);
        cats[3] = new Cat("Rujia", 15);
        cats[4] = new Cat("Seria", 12);
        Plate plate = new Plate(18);
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
