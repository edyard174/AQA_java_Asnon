package src.java.animal;

class Dog extends Animal {
    static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    public void run(int a) {
        if (a > 500) System.out.println(super.getName() + " пробежал 500 метров из " + a);
        else super.run(a);
    }
    @Override
    public void swim(int a) {
        if (a > 10) System.out.println(super.getName() + " проплыл 10 метров" + a);
        else super.swim(a);
    }
}
