package homework.homework1.task3;

public class Task3 {
    public static void main(String[] args) {
        // Длина прямоугольника 7, а ширина 8. Вывести в консоль его площадь и периметр.

        int length = 7;
        int width = 8;

        System.out.println("Площадь прямоугольника равна " + calculateArea(length, width));
        System.out.println("Периметр прямоугольника равен " + calculatePerimeter(length, width));
    }

    private static int calculateArea(int length, int width) {
        return length * width;
    }

    private static int calculatePerimeter(int length, int width) {
        return (length + width) * 2;
    }
}
