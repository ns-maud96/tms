package homework.homework1.task4;

public class Task4 {
    public static void main(String[] args) {
        // Задать две целочисленных переменных и поменять их значения местами.

        int x = 20;
        int y = 30;
        System.out.println("Начальные значения:");
        System.out.println("x = " + x + "\ny = " + y);

        int temp = y;
        y = x;
        x = temp;

        System.out.println("Конечные значения:");
        System.out.println("x = " + x + "\ny = " + y);

    }
}
