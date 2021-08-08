package homework4;

public final class FibonacciNumbers {

    private FibonacciNumbers() {
    }

    public static void getFibonacciNumbers(int inputNumber) {
        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
        int nextFibonacciNumber = 0;
        System.out.print(firstFibonacciNumber + " " + secondFibonacciNumber + " ");

        while (nextFibonacciNumber <= inputNumber) {
            nextFibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;
            if (nextFibonacciNumber > inputNumber) {
                return;
            }
            System.out.print(nextFibonacciNumber + " ");
        }
    }

    public static int getFibonacciNumbersByRecursion
            (int inputNumber, int firstFibonacciNumber, int secondFibonacciNumber) {
        if (firstFibonacciNumber == 0 && secondFibonacciNumber == 1) {
            System.out.print(firstFibonacciNumber + " " + secondFibonacciNumber + " ");
        }

        int nextFibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;

        if (checkIsOutOfRange(inputNumber, nextFibonacciNumber)) {
            System.out.print(nextFibonacciNumber + " ");
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;
            return getFibonacciNumbersByRecursion(inputNumber, firstFibonacciNumber, secondFibonacciNumber);
        }
        return nextFibonacciNumber;
    }

    private static boolean checkIsOutOfRange(int inputNumber, int nextFibonacciNumber) {
        return nextFibonacciNumber <= inputNumber;
    }
}
