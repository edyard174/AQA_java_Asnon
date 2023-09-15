package src.java;

import java.util.*;

public class Phonebook {
    private Map<Long, String> phonebook;
    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add(String surname, long number) {
        phonebook.put(number, surname);
    }
    public void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<Long, String>> set = phonebook.entrySet();
            for (Map.Entry<Long, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии нет в справочнике=(");
        }
    }
}
