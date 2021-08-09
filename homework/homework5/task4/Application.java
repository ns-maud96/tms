package homework.homework5.task4;

public class Application {

    public static void main(String[] args) {
        try {
            Task4.divideNumber();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}
