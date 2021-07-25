package homework.homework1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
        // Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")  (if-else)

        System.out.println("Введите сумму в рублях:");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        if (money % 10 >= 5 || (money % 100 >= 11 && money % 100 <= 14) || money % 10 == 0) {
            System.out.println(money + " рублей");
        } else if (money % 10 >= 2) {
            System.out.println(money + " рубля");
        } else {
            System.out.println(money + " рубль");
        }

        scan.close();

    }
}

