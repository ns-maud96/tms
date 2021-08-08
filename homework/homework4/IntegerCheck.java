package homework.homework4;

import java.util.Scanner;

public final class IntegerCheck {

    private IntegerCheck() {
    }

    public static int checkInputValue() {
        Scanner scan = new Scanner(System.in);
        int inputValue;
        do {
            System.out.println("Введите число:");
            while (!scan.hasNextInt()) {
                System.out.println("Вы ввели некорректное значение! Повторите ввод.");
                scan.next();
            }
            inputValue = scan.nextInt();
        } while (inputValue < 0);
        return inputValue;
    }
}

