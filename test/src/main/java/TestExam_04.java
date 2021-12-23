import java.util.Scanner;

/**
 * Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
 * На вход функции подаётся время в виде двух переменных: "hours" и "minutes"
 */

public class TestExam_04 {
    public static void main(String[] args) {
        System.out.println("Введите часы и минуты");
        Scanner console = new Scanner(System.in);
        int hours = console.nextInt();
        double minutes = console.nextInt();
        if (hours > 23 || hours < 0) {
            System.out.println("Неверное значение часов");
            return;
        }
        if (hours > 12) hours = (hours - 12);
        if (minutes > 59 || minutes < 0) {
            System.out.println("Неверное значение минут");
            return;
        }
        /**
         * Этот метод рассчитывает смещение часовой стрелки в течение часа
         */
        double h = ((hours * 30) + ((minutes / 60) * 6));
        if (hours == 12) h = ((minutes / 60) * 6);
        double m = minutes * 6;
        System.out.println("Угол между часовой и минутной стрелками составляет " + (Math.abs(h - m)) + "°");
        /**
         * Если нужно посчитать угол между стрелками часов, то тут немного по-другому,
         * разница видна на примере времени 12:59
         */
        double x = h - m;
        double y = 360 - (m - h);
        double z = 0;
        if (Math.abs(x) > Math.abs(y)) z = y;
        else z = x;
        System.out.println("Угол между стрелками часов составляет " + Math.abs(z) + "°");
    }
}
