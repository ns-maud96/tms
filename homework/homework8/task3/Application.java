package homework.homework8.task3;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Set hashSet1 = new HashSet();
        for (int i = 1; i <= 10; i++) {
            hashSet1.add(i);
        }
        System.out.println("hashSet1=" + hashSet1);

        Set hashSet2 = new HashSet();
        for (int i = 5; i <= 15; i++) {
            hashSet2.add(i);
        }
        System.out.println("hashSet2=" + hashSet2);

        UtilSetMethods.combineSets(hashSet1, hashSet2);
        UtilSetMethods.createCommonElementsSet(hashSet1, hashSet2);
    }
}
