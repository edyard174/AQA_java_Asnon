import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean limit(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }
    public static void numberSing(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }
    public static boolean numberSingBool(int a) {
        return a < 0;
    }

    public static void printString(String s, int a) {
        for (int i = 1; i <= a; i++) System.out.println(s);
    }
    public static boolean leapYear(int a) {
        return (a % 4 == 0) && (a % 100 > 0) || (a % 400 == 0);
    }
    public static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }
    public static void full() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void magnifier(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
    }
    public static void diagonal(int a) {
        int[][] square = new int[a][a];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) square[i][j] = 1;
            }
        }
        for (int[] num: square) System.out.println(Arrays.toString(num));
    }
    public static int[] monoArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
