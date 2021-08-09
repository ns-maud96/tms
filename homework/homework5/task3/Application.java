package homework.homework5.task3;

public class Application {

    public static void main(String[] args) {
        try {
            Task3.getNumberFromConsole();
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }
}
