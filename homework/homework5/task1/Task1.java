package homework.homework5.task1;

public class Task1 {

    public static void main(String[] args) {
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
