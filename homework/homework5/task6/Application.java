package homework.homework5.task6;

import java.util.InputMismatchException;

public class Application {

    public static void main(String[] args) {
        try {
            Task6.createArray();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный тип элемента");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NegativeArraySizeException e) {
            System.out.println("Неверная размерность массива");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
