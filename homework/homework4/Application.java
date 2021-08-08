package homework.homework4;

public class Application {

    public static void main(String[] args) {
        System.out.println("Сумма цифр данного числа: " + SumOfNumbers.sumOfNumbers(IntegerCheck.checkInputValue()));
        System.out.println();
        System.out.println("Числа Фибоначчи:");
        FibonacciNumbers.getFibonacciNumbers(IntegerCheck.checkInputValue());
        System.out.println();
        FibonacciNumbers.getFibonacciNumbersByRecursion
                (IntegerCheck.checkInputValue(), 0, 1);
    }
}
