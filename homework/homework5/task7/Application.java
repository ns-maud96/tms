package homework.homework5.task7;

public class Application {

    public static void main(String[] args) {
        try {
            Task7.createRandomArray();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Программа завершена");
        }
    }
}
