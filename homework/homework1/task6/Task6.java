package homework.homework1.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Задать трёхзначную целочисленную переменную и найти произведение всех цифр заданного числа.

        boolean check = false;
        int variable = 0;

        while (check == false) {
            System.out.println("Введите трехзначное число:");
            Scanner scan = new Scanner(System.in);
            variable = scan.nextInt();
            check = variable >= 100 && variable < 1000;
        }

        System.out.println("Произведение всех цифр = " + multiplyEachNumbers(variable));

    }

    public static int multiplyEachNumbers(int variable) {
        return ((variable / 100) % 10) * ((variable / 10) % 10) * (variable % 10);
    }
}

