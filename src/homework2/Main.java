package homework2;

import static homework2.Array.getArray;

public class Main {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "2"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            int result = getArray(arr);
            System.out.println("Сумма массива " +result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка! Массив не соответствует размеру 4х4");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка! Массив должен содержать только числа!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
}
