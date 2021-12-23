/**
 * Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
 */


public class TestExam_02 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k])
                    System.out.println("повторяющаяся буква " + array[k]);
            }
        }
    }
}