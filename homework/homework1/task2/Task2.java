package homework.homework1.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Написать программу, которая определяет, является ли последняя цифра заданного целого  числа – цифрой 3.

        System.out.println("Введите целое число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(isLastNumber3(number));

        scan.close();
    }

    private static String isLastNumber3(int number) {
        return (number % 10 == 3 ? "Последняя цифра заданного числа 3" :
                "Последняя цифра заданного числа отличается от 3");
    }
}
