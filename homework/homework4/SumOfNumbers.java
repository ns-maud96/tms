package homework.homework4;

public final class SumOfNumbers {

    private SumOfNumbers() {
    }

    public static int sumOfNumbers(int wholeNumber) {
        int sumOfEachNumber = 0;
        while (wholeNumber % 10 != 0) {
            int eachNumber = wholeNumber % 10;
            sumOfEachNumber += eachNumber;
            wholeNumber = (wholeNumber - eachNumber) / 10;
        }
        return sumOfEachNumber;
    }
}
