package homework.homework5.task2;

public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
