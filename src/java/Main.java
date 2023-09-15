package src.java;

import java.util.*;

import static src.java.ListWord.wordCounter;

public class Main {
    public static void main(String[] args) {
        List<String> list = ListWord.getList();
        System.out.println(list);
        wordCounter(list);
        Phonebook ph = new Phonebook();
        ph.add("Иванов", 89089089089l);
        ph.add("Петров", 89999999999l);
        ph.add("Иванов", 89229987766l);
        ph.add("Сидаров", 89505500555l);
        ph.add("Романов", 89047256677l);
        ph.add("Петров", 89000909090l);
        ph.get("Иванов");
        ph.get("Петров");
        ph.get("Сидаров");
        ph.get("Романов");
        ph.get("Гагарин");
    }
}
