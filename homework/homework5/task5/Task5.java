package homework.homework5.task5;

import java.util.Scanner;

public final class Task5 {

    private Task5() {
    }

    public static double calculateSquareRoot() throws SqrtException {
        try {
            double result = Math.sqrt(getInputNumber());
            return result;
        } catch (RuntimeException e) {
            throw new SqrtException("Корень из отрицательного числа не вычисляется.", e);
        }
    }

    private static double getInputNumber() {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        if (number <= 0) {
            throw new RuntimeException();
        }
        return number;
    }
}
