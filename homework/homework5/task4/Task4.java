package homework.homework5.task4;

import java.util.Scanner;

public final class Task4 {

    private Task4() {
    }

    public static int divideNumber() throws DivideException {
        System.out.println("Введите первое число:");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scan.nextInt();
        if (secondNumber == 0) {
            throw new DivideException("Деление на ноль!");
        }
        int result = firstNumber / secondNumber;
        scan.close();
        return result;
    }
}

