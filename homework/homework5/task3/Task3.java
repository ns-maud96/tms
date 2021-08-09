package homework.homework5.task3;

import java.util.Scanner;

public final class Task3 {

    private Task3() {
    }

    public static int getNumberFromConsole() throws NegativeNumberException {

        System.out.println("Введите целое число:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            throw new NegativeNumberException();
        }
        return number;
    }
}

