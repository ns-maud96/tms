package homework.homework5.task5;

public class Application {

    public static void main(String[] args) {
        try {
            Task5.calculateSquareRoot();
        } catch (SqrtException e) {
            e.printStackTrace();
        }
    }
}
