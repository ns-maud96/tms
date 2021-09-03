package homework.homework8.task3;

import java.util.HashSet;
import java.util.Set;

public final class UtilSetMethods {

    private UtilSetMethods() {
    }

    public static Set combineSets(Set set1, Set set2) {
        Set combinedSet = new HashSet(set1);
        combinedSet.addAll(set2);
        System.out.println("combinedSet=" + combinedSet);
        return combinedSet;
    }

    public static Set createCommonElementsSet(Set set1, Set set2) {
        Set commonSet = new HashSet(set1);
        commonSet.retainAll(set2);
        System.out.println("commonElementsSet=" + commonSet);
        return commonSet;
    }
}
