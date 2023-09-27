package src.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Ex 2:");
        List<String> l2 = Arrays.asList("Highload", "High", "Load", "Highload", "End");
        String str = "High";
        System.out.println(l2);
        System.out.println("Ex 2.1: Слово " + str + " встречается " + counter(l2, str) + " раза");
        System.out.println("Ex 2.2: Первый элемент коллекции: " + firstElement(l2));
        System.out.println("Ex 2.3: Последний элемент коллекции: " + lastElement(l2));
        System.out.println("Ex 2.2/2.3: С пустой коллекциейю.");
        l2 = Arrays.asList();
        System.out.println("Ex 2.2: Первый элемент коллекции: " + firstElement(l2));
        System.out.println("Ex 2.3: Последний элемент коллекции: " + lastElement(l2));
    }
        public static long counter (List <String> list, String s){
            return list.stream().filter(n -> n.equals(s)).count();
        }

        public static Object firstElement (List <String> list) {
            Optional o = list.stream().findFirst();
            if (o.isEmpty()) {
                return 0;
            } else return o.get();
        }
        public static Object lastElement (List <String> list) {
            Collections.reverse(list);
            Optional o = list.stream().findFirst();
            if (o.isEmpty()) {
                return 0;
            } else return o.get();
        }
    }
