package homework.homework8.task2;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        String[] stringArray = {"first", "second", "third", "first"};

        System.out.println(UtilCheckObjects.checkObjectType("first", stringArray));
        System.out.println(UtilCheckObjects.checkObjectType(23, stringArray));
    }
}
