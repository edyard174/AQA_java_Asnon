package src.java;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        System.out.println("Выбрасываем исключение MyArraySizeException");
        try {
            String[][] ar = {{"6", "4", "12", "9"}, {"8", "5", "15", "9"}, {"23", "45", "3", "22"}, {"27", "19", "7", "1"}, {"65"}};
            sum(ar);
        } catch (Exception e) {}
        System.out.println("\nВыбрасываем исключение MyArraySizeException");
        try {
            String[][] ar = {{"6", "4", "12", "9"}, {"8", "5", "15", "9"}, {"23", "45", "3", "22"}, {"27", "19", "7", "1", "6"}};
            sum(ar);
        } catch (Exception e) {}
        System.out.println("\nВыбрасываем исключение MyArrayDataException");
        try {
            String[][] ar = {{"6", "4", "12", "9"}, {"8", "5", "15", "g"}, {"23", "45", "3", "22"}, {"27", "19", "7", "1"}};
            sum(ar);
        } catch (Exception e) {}

        String[][] ar = {{"6", "4", "12", "9"}, {"8", "5", "15", "9"}, {"23", "45", "3", "22"}, {"27", "19", "7", "1"}};
        System.out.println("\nНормальная работа метода sum(): " + sum(ar));
    }

    public static int sum(String[][] ar) throws MyArrayDataException, MyArraySizeException {
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            if (ar.length > 4) throw new MyArraySizeException("Количество массивов превышенно!");
            for (int j = 0; j < 4; j++) {
                if (ar[i].length > 4) throw new MyArraySizeException("Длина массива " + i + " привышена!");
                try {
                    summa += Integer.parseInt(ar[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "][" + j + "] лежит символ " + ar[i][j]);
                }
            }
        }
        return summa;
    }
}
