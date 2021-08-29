package homework.homework7;

public interface GeometricShape {

    double getSquare();

    double getPerimeter();

    default boolean isSquareEqual(GeometricShape geometricShape) {
        if (geometricShape.getSquare() == getSquare()) {
            return true;
        }
        return false;
    }
}
