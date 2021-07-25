package homework.homework1.task1;

public class Task1 {
    public static void main(String[] args) {
        // Написать программу, в которой задан один целочисленный параметр и программа рассчитывает значение,
        // равное этому параметру, возведенному в куб.

        int variable = 5;
        System.out.println(cube(variable));

    }

    private static int cube(int variable) {
        return (int) Math.pow(variable, 3);
    }
}
