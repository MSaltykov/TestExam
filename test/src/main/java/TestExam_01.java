/**
 * Сформировать и заполнить массив случайным числами и вывести максимальное,
 * минимальное и среднее значение.
 * Для генерации случайного числа использовать метод Math.random(),
 * который возвращает значение в промежутке [0, 1].
 */

public class TestExam_01 {
    public static void main(String[] args) {

        double[] array;
        array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * (1 - 0) + 0);
        }
        double max = 0;
        double min = 2;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Max = " + max);
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("Min = " + min);
        for (int i = 0; i < array.length; i++) {
            avg = array[i] / array.length;
        }
        System.out.println("Average = " + avg);
    }
}

