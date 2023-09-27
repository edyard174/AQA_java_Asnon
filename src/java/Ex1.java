package src.java;

import java.util.ArrayList;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            al.add(r.nextInt(100));
        }
        System.out.println("Ex 1:");
        System.out.println(al);
        System.out.println("Количество четных чисел: " + al.stream().filter(n -> (n % 2) == 0).count());
    }
}
