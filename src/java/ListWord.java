package src.java;

import java.util.*;

public class ListWord {
    public static List<String> getList() {
        List<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("Word");
        array.add("Java");
        array.add("World");
        array.add("Car");
        array.add("Array");
        array.add("List");
        array.add("Hello");
        array.add("Java");
        array.add("Word");
        array.add("Hello");
        return array;
    }
    public static void wordCounter(List<String> arr) {
        Set<String> set = new HashSet<>();
        for (String s: arr) {
            set.add(s);
        }
        for (String s: set) {
            int count = 0;
            for (String st: arr) {
                if (s.equals(st)) count++;
            }
            System.out.println(s + ": " + count + "шт");
        }
    }
}
