package homework.homework5.task6;

import java.util.Arrays;
import java.util.Scanner;

public final class Task6 {

    private Task6() {
    }

    public static void createArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размерность массива:");
        int[] array = new int[scan.nextInt()];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length + 1; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        scan.close();
    }
}
