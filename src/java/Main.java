package src.java;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String name = "data.csv";
        String[] header = {"Value 1", "Value 2", "Value 3"};
        AppData ad1 = new AppData(header, new int[][] {{100, 200, 123}, {300, 400, 500}});
        AppData ad2 = new AppData(header, new int[][] {{10, 20, 30}, {11, 22, 33}, {12, 34, 56}, {345, 5436, 7}});
        save(name, ad1);
        read(name);
        save(name, ad2);
        read(name);

    }
    public static void save(String name, AppData ad) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {
            bw.write(ad.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(String name) {
        try(BufferedReader br = new BufferedReader(new FileReader(name))) {
            String s2;
            while ((s2 = br.readLine()) != null) {
                System.out.println(s2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}