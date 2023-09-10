package src.java;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    AppData(String[] header, int[][] data){
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer(String.join(";", header) + "\n");
        for (int[] e: data) {
            for (int u: e) {
                s.append(u).append(";");
            }
            s.delete(s.length()-1, s.length());
            s.append("\n");
        }
        return s.toString();
    }
}
