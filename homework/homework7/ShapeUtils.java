package homework.homework7;

import homework.homework7.circle.Circle;
import homework.homework7.quadrangle.Quadrangle;
import homework.homework7.triangle.EquilateralTriangle;
import homework.homework7.triangle.Triangle;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isQuadrangle(GeometricShape geometricShape) {
        if (geometricShape instanceof Quadrangle) {
            return true;
        }
        return false;
    }

    public static boolean isTriangle(GeometricShape geometricShape) {
        if (geometricShape instanceof Triangle || geometricShape instanceof EquilateralTriangle) {
            return true;
        }
        return false;
    }

    public static boolean isCircle(GeometricShape geometricShape) {
        if (geometricShape instanceof Circle) {
            return true;
        }
        return false;
    }
}
