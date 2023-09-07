package src.java.animal;

public class Cat extends Animal {

    private int satiety;
    boolean full = false;
    static int catCount;

    public Cat() {}
    public Cat(String name, int satiety) {
        super(name);
        this.satiety = satiety;
        catCount++;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    @Override
    public void run(int a) {
        if (a > 200) System.out.println(super.getName() + " пробежал 200 метров из " + a);
        else super.run(a);
    }
    @Override
    public void swim(int a) {
        System.out.println("Кот не умеет плавать");
    }
    public void eat(Plate p) {
        full = p.feed(satiety);
    }
    public void info() {
        String s = " голоден";
        if (full) s = " сыт";
        System.out.println(super.getName() + s);
    }
}
