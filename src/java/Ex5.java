package src.java;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Ex 5:");
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        List<String> al = new ArrayList<>();
        String s;
        while (true) {
            s =red.readLine();
            if (s.equals("")) {
                break;
            }
            al.add(s);
        }
        System.out.println(al.stream().filter(x -> x.charAt(0) == 'f').collect(Collectors.toList()));
    }
}
