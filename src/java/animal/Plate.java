package src.java.animal;

public class Plate {
    private int food;

    public Plate() {}
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void add(int a) {
        food += a;
    }
    public boolean feed(int a) {
        return food > a;
    }
}
