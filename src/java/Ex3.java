package src.java;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Ex 3:");
        List<String> l3 = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        System.out.println(l3);
        String[] s3 = l3.stream().sorted(((o1, o2) -> {
            int a = Integer.parseInt(o1.substring(1));
            int b = Integer.parseInt(o2.substring(1));
            return a - b;
        })).toArray(String[]::new);
        Arrays.stream(s3).map(s -> s + " ").forEach(System.out::print);}
}
