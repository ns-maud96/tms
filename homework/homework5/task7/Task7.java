package homework.homework5.task7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class Task7 {

    private Task7() {
    }

    public static void createRandomArray() {
        Random rand = new Random();             // не уловила суть с 50%,  но пусть будет так
        int addNumber = rand.nextInt(2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размерность массива:");
        int[] array = new int[scan.nextInt()];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length + addNumber; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        scan.close();
    }
}
