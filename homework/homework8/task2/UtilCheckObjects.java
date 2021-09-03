package homework.homework8.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class UtilCheckObjects {

    private UtilCheckObjects() {
    }

    public static boolean checkObjectType(Object object, Object[] array) {
        Set hashSet = new HashSet(Arrays.asList(array));
        return hashSet.contains(object);
    }
}
