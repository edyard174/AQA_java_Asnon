package src.java.animal;

public class Animal {
    private String name;
    static int animalCount;

    public Animal() {}
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int a) {
        System.out.println(name + " пробежал " + a + " метров");
    }
    public void swim(int a) {
        System.out.println(name + " проплыл" + a + " метров");
    }
}
